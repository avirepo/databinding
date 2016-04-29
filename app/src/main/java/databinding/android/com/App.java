package databinding.android.com;

import android.app.Application;

import databinding.android.com.utils.FontManager;

/**
 * Author Vikas for the class App on 14/04/16 - 10:14 AM.
 * All copyrights reserved to the user Vikas.
 * Class behaviour is..."Please Define here"
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FontManager.init(this);
    }
}
