package databinding.android.com.model;

public class BindingTest {

    public BindableString mTitle = new BindableString();

    public BindableString mImage = new BindableString();

    public BindableString mErrorImage = new BindableString();

    public BindableString mInput = new BindableString();

    public BindableBoolean mIsActive = new BindableBoolean();

    public BindableString mNullString = new BindableString();

    public BindableInt mCount = new BindableInt();

    public String mNext = "Next ";

    public BindingTest(String pTitle, String pImageUrl) {
        mTitle.set(pTitle);
        mImage.set(pImageUrl);
        mErrorImage.set(pImageUrl);
    }

    public boolean isActive() {
        return mIsActive.get();
    }

    public void setActive(boolean pActive) {
        mIsActive.set(pActive);
    }
}
