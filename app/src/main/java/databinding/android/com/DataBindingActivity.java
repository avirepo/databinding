package databinding.android.com;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import com.squareup.picasso.Picasso;

import databinding.android.com.callbacks.CallbackHandler;
import databinding.android.com.databinding.ActivityDataBindingBinding;
import databinding.android.com.model.BindingTest;


public class DataBindingActivity extends AppCompatActivity {

    public static final String TITLE_1 = "Test Data";
    public static final String TITLE_2 = "Testing ";
    private static final String IMAGE_1 = "http://pre11.deviantart.net/5566/th/pre/f/2010/171/4/0/paint_splash_png_by_absurdwordpreferred.png";
    private static final String IMAGE_2 = "http://img4.wikia.nocookie.net/__cb20131022214617/disney/images/1/16/Mickey_Mouse_image_transparent.png";
    private BindingTest test;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        test = new BindingTest(TITLE_1, IMAGE_1);
        binding.setTestData(test);
        binding.setHandler(new ButtonCallback());
        scheduleTask();
    }

    private void scheduleTask() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                test.setTitle(TextUtils.equals(test.getTitle(), TITLE_1) ? TITLE_2 : TITLE_1);
                test.setImageUrl(TextUtils.equals(test.getImageUrl(), IMAGE_1) ? IMAGE_2 : IMAGE_1);
                scheduleTask();
            }
        }, 10000);
    }



    private class ButtonCallback implements CallbackHandler {
        @Override
        public void onClickButton(View pView) {
            Intent intent = new Intent(DataBindingActivity.this, ListItemActivity.class);
            startActivity(intent);
        }
    }
}
