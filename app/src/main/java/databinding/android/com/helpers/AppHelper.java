package databinding.android.com.helpers;

import android.text.TextUtils;

import databinding.android.com.model.BindingTest;

/**
 * Author Vikas for the class AppHelper on 14/04/16 - 2:59 PM.
 * All copyrights reserved to the user Vikas.
 * Class is helper class for the application level task
 */
public class AppHelper {

    public static final String IMAGE_1 = "http://pre11.deviantart.net/5566/th/pre/f/2010/171/4/0/paint_splash_png_by_absurdwordpreferred.png";
    public static final String IMAGE_2 = "http://img4.wikia.nocookie.net/__cb20131022214617/disney/images/1/16/Mickey_Mouse_image_transparent.png";
    public static final String ERROR_IMAGE_URL = "http://bvhvxh/ggj";

    //Changing text of model based on their existing text
    public static void changeText(BindingTest test) {
        test.mIsActive.set(!test.mIsActive.get());
        test.mImage.set(TextUtils.equals(test.mImage.get(), IMAGE_1) ? IMAGE_2 : IMAGE_1);
        test.mErrorImage.set(TextUtils.equals(test.mErrorImage.get(), ERROR_IMAGE_URL)
                ? IMAGE_1 : ERROR_IMAGE_URL);
    }
}
