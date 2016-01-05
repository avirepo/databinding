package databinding.android.com;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by vikas on 12/14/15.
 */
public class Pref {
    private static final String PREF_NAME = "AppName_%s";
    private SharedPreferences mPreferences;
    private String mUserId;
    private static Pref sInstance;

    private Pref(Context pContext, String pUserId) {
        mUserId = pUserId;
        mPreferences = pContext.getSharedPreferences(String.format(PREF_NAME, pUserId), Context.MODE_PRIVATE);
    }


    public String getUserId() {
        return mUserId;
    }

    public static Pref getPreferences(Context context, String userId) {
        if (null != sInstance || !TextUtils.equals(sInstance.getUserId(), userId)) {
            sInstance = new Pref(context, userId);
        }
        return sInstance;
    }

    //write methods for updating in preference files
}
