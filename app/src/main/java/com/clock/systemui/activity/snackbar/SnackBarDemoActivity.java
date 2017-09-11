package com.clock.systemui.activity.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.clock.systemui.R;

/**
 * http://www.jianshu.com/p/cd1e80e64311/
 */
public class SnackBarDemoActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "SnackBarDemoActivity";
    private View mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar_demo);

        mContainer = findViewById(R.id.container);

        findViewById(R.id.btn_simple_snack_bar).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btn_simple_snack_bar) {
            Snackbar.make(mContainer, "Hello SnackBar!", Snackbar.LENGTH_LONG).setAction("Clock", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // do something
                    Log.d(TAG, "onClick: snackbar 被点击了");
                }
            }).show();
        }
    }
}
