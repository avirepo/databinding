package databinding.android.com.model;

import android.databinding.BaseObservable;

public class BindableString extends BaseObservable {
    String value;

    public String get() {
        return value;
    }

    public void set(String value) {
        if (this.value == null || !this.value.equals(value)) {
            this.value = value;
            notifyChange();
        }
    }

    public boolean isEmpty() {
        return value == null || value.isEmpty();
    }
}