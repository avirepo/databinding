package databinding.android.com.model;

import android.databinding.ObservableField;

/**
 * Created by vikas on 12/15/15.
 */
public class ListItem {
    private String title;
    private String imageUrl;
    public String mDescription ;


    public ListItem(String pTitle, String pImageUrl) {
        title = pTitle;
        imageUrl = pImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String pTitle) {
        title = pTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String pImageUrl) {
        imageUrl = pImageUrl;
    }
}
