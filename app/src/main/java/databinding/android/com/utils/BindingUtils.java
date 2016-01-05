package databinding.android.com.utils;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

/**
 * Created by vikas on 12/10/15.
 */
public class BindingUtils {

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext().getApplicationContext())
                .load(url)
                .fit()
                .centerInside()
                .into(view);
    }

    @BindingAdapter({"bind:font"})
    public static void setFont(TextView pView, String font) {

    }
}
