package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mistyrain.cat_foundation.support.event.EventCenter;
import com.mistyrain.stock.R;
import com.mistyrain.stock.base.BaseFragment;
import com.mistyrain.stock.ui.feedback.FeedBackActivity;
import com.mistyrain.stock.ui.login.LoginActivity;
import com.mistyrain.stock.ui.transfer.TransferActivity;
import com.mistyrain.stock.ui.user.UserProfileActivity;

import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class MineFragment extends BaseFragment {

    @InjectView(R.id.lyswtichaccount)
    LinearLayout lySwtichAccount;

    @InjectView(R.id.lyfeedback)
    LinearLayout lyFeedback;
    @InjectView(R.id.lytransfer)
    LinearLayout lyTransfer;

    @InjectView(R.id.lyuserprofile)
    LinearLayout lyUserProfile;


    public static MineFragment newInstance(String param1) {
        MineFragment fragment = new MineFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public MineFragment() {


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
        return R.layout.mine;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @OnClick({ R.id.lyswtichaccount,R.id.lyuserprofile,R.id.lyfeedback,R.id.lytransfer })
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lyswtichaccount:
                readyGo(LoginActivity.class);
                break;
            case R.id.lyfeedback:
                readyGo(FeedBackActivity.class);
                break;
            case R.id.lytransfer:
                readyGo(TransferActivity.class);
                break;
            case R.id.lyuserprofile:
                readyGo(UserProfileActivity.class);
                break;
        }


    }
}
