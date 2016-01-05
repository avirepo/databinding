package databinding.android.com;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import databinding.android.com.adapter.BindingTestAdapter;
import databinding.android.com.model.ListItem;
import databinding.android.com.utils.BindingUtils;

public class ListItemActivity extends AppCompatActivity {
    private BindingTestAdapter mAdapter;
    private List<ListItem> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_list_activity_contents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        populateDemoData();
        mAdapter = new BindingTestAdapter(mData);
        recyclerView.setAdapter(mAdapter);
    }

    private void populateDemoData() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                ListItem object = new ListItem("Test Data 1", "http://pre11.deviantart.net/5566/th/pre/f/2010/171/4/0/paint_splash_png_by_absurdwordpreferred.png");
                object.mDescription = "Test 1";
                mData.add(object);

            } else {
                ListItem object = new ListItem("Test Data 2", "http://img4.wikia.nocookie.net/__cb20131022214617/disney/images/1/16/Mickey_Mouse_image_transparent.png");
                object.mDescription = "Test 2";
                mData.add(object);
            }
        }
    }

}
