package com.clock.systemui.activity.navigation;

import android.os.Bundle;

import com.clock.systemui.R;
import com.clock.systemui.activity.base.BaseActivity;

/**
 * 仿网易云音乐
 *要点: 直接自定义布局实现DrawerLayout的菜单项
 * @author Clock
 * @since 2016-02-27
 */
public class CloudMusicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_music);
    }
}
