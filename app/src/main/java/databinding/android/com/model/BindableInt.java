package databinding.android.com.model;

import android.databinding.BaseObservable;

public class BindableInt extends BaseObservable {
    int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        if (this.value != value) {
            this.value = value;
            notifyChange();
        }
    }
}