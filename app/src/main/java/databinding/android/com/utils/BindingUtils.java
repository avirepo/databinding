package databinding.android.com.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.v4.util.Pair;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import databinding.android.com.R;
import databinding.android.com.model.BindableString;


public class BindingUtils {


    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext().getApplicationContext())
                .load(url)
                .fit()
                .centerInside()
                .into(view);
    }

    @BindingAdapter({"bind:imageUrl", "bind:error"})
    public static void loadImageWithError(ImageView view, String url, Drawable error) {
        Picasso.with(view.getContext().getApplicationContext())
                .load(url)
                .fit()
                .centerInside()
                .error(error)
                .into(view);
    }

    @BindingAdapter({"bind:font"})
    public static void setFont(TextView pView, String font) {
        pView.setTypeface(FontManager.getInstance().getFontForType(font));
    }

    @BindingAdapter({"app:binding"})
    public static void bindEditText(EditText view, final BindableString bindableString) {
        Pair<BindableString, TextWatcherAdapter> pair = (Pair) view.getTag(R.id.bound_observable);
        if (pair == null || pair.first != bindableString) {
            if (pair != null) {
                view.removeTextChangedListener(pair.second);
            }
            TextWatcherAdapter watcher = new TextWatcherAdapter() {
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    bindableString.set(String.valueOf(s).trim());
                }
            };
            view.setTag(R.id.bound_observable, new Pair<>(bindableString, watcher));
            view.addTextChangedListener(watcher);
        }
        String newValue = bindableString.get();
        if (!view.getText().toString().equals(newValue)) {
            view.setText(newValue);
        }
    }

}
