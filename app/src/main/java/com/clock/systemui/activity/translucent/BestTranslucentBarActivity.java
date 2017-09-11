package com.clock.systemui.activity.translucent;

import android.os.Bundle;

import com.clock.systemui.R;

/**
 * TranslucentBar最好的实现方式
 *我猜测是因为这样通过代码动态设置fitSystemWindows, 兼容性更好, 以免在sdk19一下使用这个属性会报错.
 * @author Clock
 * @since 2016-02-22
 */
public class BestTranslucentBarActivity extends TranslucentBarBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_best_translucent_bar;
    }
}
