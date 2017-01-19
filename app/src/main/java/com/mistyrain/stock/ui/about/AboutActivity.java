package com.mistyrain.stock.ui.about;

import android.os.Bundle;
import android.view.View;

import com.mistyrain.cat_foundation.support.event.EventCenter;
import com.mistyrain.cat_foundation.utils.NetUtils;
import com.mistyrain.stock.R;
import com.mistyrain.stock.base.BaseSwipeBackActivity;

/**
 * Created by wutao on 2017/1/19.
 * 关于
 */

public class AboutActivity extends BaseSwipeBackActivity {
    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.about_system;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }
}
