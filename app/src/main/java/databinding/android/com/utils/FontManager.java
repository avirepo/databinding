package databinding.android.com.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Author Vikas for the class FontManager on 14/04/16 - 10:07 AM.
 * All copyrights reserved to the user Vikas.
 * Class behaviour is to load and provide font ofr application
 */
public class FontManager {
    public static final String TEST_FONT = "testfont.ttf";
    private static FontManager sInstance;
    private final Typeface NORMAL;

    private FontManager(Context pApplication) {
        NORMAL = Typeface.createFromAsset(pApplication.getAssets(), TEST_FONT);
    }

    public static void init(Context pApplication) {
        sInstance = new FontManager(pApplication);
    }

    public static FontManager getInstance() {
        if (sInstance == null) {
            throw new IllegalStateException("To get instance first initialize the class in app application class");
        }
        return sInstance;
    }

    public Typeface getFontForType(String pType) {
        //Put your check font logic here;
        return NORMAL;
    }
}
