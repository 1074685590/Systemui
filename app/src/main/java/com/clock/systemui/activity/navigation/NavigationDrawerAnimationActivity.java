package com.clock.systemui.activity.navigation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.clock.systemui.R;
import com.clock.systemui.activity.base.BaseActivity;

/**
 * 导航动画效果
 *http://blog.csdn.net/miyuexingchen/article/details/52232751
 * @author Clock
 * @since 2016-02-28
 */
public class NavigationDrawerAnimationActivity extends BaseActivity {

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_animation);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
    }

    /**
     * 当Activity彻底运行起来之后回调onPostCreate方法
     * @param savedInstanceState
     */
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mActionBarDrawerToggle.syncState();
    }

    /**
     * http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/0925/1713.html
     * 如何让app图标点击的时候能够展开或者隐藏侧边菜单。
     一般的想法是在activity的onOptionsItemSelected方法中判断点击事件是否来自于app图标，
     然后用DrawerLayout.closeDrawer和DrawerLayout.openDrawer来隐藏与展开
     （参见第4点：在代码中主动展开与隐藏侧边菜单）。但是drawerLayout提供了更优雅的方式：
     使用ActionBarDrawerToggle的onOptionsItemSelected方法。该方法activity的onOptionsItemSelected
     方法中根据传递进来的menu item做了上面我们在“一般想法”中提到的事情。用官方的说法是”ActionBarDrawerTogglewill take care of this”。
     我们只需这样做就ok了：
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mActionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mActionBarDrawerToggle.onConfigurationChanged(newConfig);
    }
}
