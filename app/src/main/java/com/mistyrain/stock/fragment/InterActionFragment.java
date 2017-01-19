package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.view.View;

import com.mistyrain.cat_foundation.support.event.EventCenter;
import com.mistyrain.stock.R;
import com.mistyrain.stock.base.BaseFragment;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class InterActionFragment extends BaseFragment {

    public static InterActionFragment newInstance(String param1) {
        InterActionFragment fragment = new InterActionFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public InterActionFragment() {


    }
        @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.interaction;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }
}
