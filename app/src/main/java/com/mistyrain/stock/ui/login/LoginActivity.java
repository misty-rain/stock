package com.mistyrain.stock.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mistyrain.cat_foundation.support.event.EventCenter;
import com.mistyrain.cat_foundation.utils.NetUtils;
import com.mistyrain.stock.R;
import com.mistyrain.stock.base.BaseSwipeBackActivity;
import com.mistyrain.stock.ui.register.RegisterActivity;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by wutao on 2017/1/19.
 * <p>
 * 登陆
 */

public class LoginActivity extends BaseSwipeBackActivity {

    @InjectView(R.id.txtgoregister)
    TextView txtGoRegister;

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return true;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.login;
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

    @OnClick(R.id.txtgoregister)
        public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtgoregister:
                readyGo(RegisterActivity.class);
                break;
        }

        }

}
