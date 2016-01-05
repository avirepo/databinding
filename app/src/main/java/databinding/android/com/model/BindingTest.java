package databinding.android.com.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import databinding.android.com.BR;

public class BindingTest extends BaseObservable {

    private String title;
    private String imageUrl;

    public BindingTest(String pTitle, String pImageUrl) {
        title = pTitle;
        imageUrl = pImageUrl;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (TextUtils.equals(title, this.title)) {
            return;
        }
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String pImageUrl) {
        if (TextUtils.equals(pImageUrl, imageUrl)) {
            return;
        }
        imageUrl = pImageUrl;
        notifyPropertyChanged(BR.imageUrl);
    }
}
