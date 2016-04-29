package databinding.android.com.model;

import android.databinding.BaseObservable;

public class BindableBoolean extends BaseObservable {
    boolean value;

    public boolean get() {
        return value;
    }

    public void set(boolean value) {
        if (this.value != value) {
            this.value = value;
            notifyChange();
        }
    }
}