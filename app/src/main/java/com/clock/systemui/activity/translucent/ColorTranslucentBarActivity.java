package com.clock.systemui.activity.translucent;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;

import com.clock.systemui.R;
import com.clock.systemui.activity.base.BaseActivity;
import com.clock.systemui.fragment.ColorTranslucentFragment;

/**
 * 总结: 实现状态栏透明 直接改变主题就好了,简单方便,当然通过代码也是可以的
 */
public class ColorTranslucentBarActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_translucent_bar);

        findViewById(R.id.btn_show_toast).setOnClickListener(this);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container ,new ColorTranslucentFragment());
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btn_show_toast) {
            //不要在theme中设置<item name="android:fitsSystemWindows">true</item>
            //如果不在布局文件中设置这个属性,系统状态栏不占用空间
            Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show();
        }
    }
}
