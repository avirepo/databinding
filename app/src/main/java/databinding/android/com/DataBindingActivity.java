package databinding.android.com;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import databinding.android.com.callbacks.CallbackHandler;
import databinding.android.com.databinding.ActivityDataBindingBinding;
import databinding.android.com.helpers.AppHelper;
import databinding.android.com.model.BindingTest;


public class DataBindingActivity extends AppCompatActivity {

    private ActivityDataBindingBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        BindingTest testData = new BindingTest("Test Data", AppHelper.IMAGE_1);
        testData.mIsActive.set(true);
        testData.mCount.set(10);
        mBinding.setTestData(testData);
        testData.mCount.set(9);
//        testData.mInput.set("Test");
        mBinding.setHandler(new ButtonCallback());

    }


    private class ButtonCallback implements CallbackHandler {
        @Override
        public void onPositiveClick(View pView) {
            Toast.makeText(DataBindingActivity.this, "Positive clicked", Toast.LENGTH_SHORT).show();
            BindingTest testData = mBinding.getTestData();
            AppHelper.changeText(testData);
        }

        @Override
        public void onNegativeClick(View pView) {
            Toast.makeText(DataBindingActivity.this, "Negative clicked", Toast.LENGTH_SHORT).show();
            BindingTest testData = mBinding.getTestData();
            AppHelper.changeText(testData);
        }
    }
}

/*if (pView.getId() == R.id.btn_navigate) {
        Intent intent = new Intent(DataBindingActivity.this, ListItemActivity.class);
        startActivity(intent);
        } else if (pView.getId() == R.id.btn_change) {
        AppHelper.changeText(mBinding.getTestData());
        }*/
