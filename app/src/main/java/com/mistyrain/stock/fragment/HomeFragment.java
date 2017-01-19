package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.view.View;

import com.mistyrain.cat_foundation.support.event.EventCenter;
import com.mistyrain.stock.R;
import com.mistyrain.stock.base.BaseFragment;
import com.mistyrain.stock.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class HomeFragment extends BaseFragment {
    @InjectView(R.id.banner)
    Banner banner;
   /* @InjectView(R.id.swipe_layout)
    XSwipeRefreshLayout xSwipeRefreshLayout;*/
 /*   @InjectView(R.id.recycler_view)
    RecyclerView recyclerView;*/

    List<String> bannerImageList = new ArrayList<String>();

    public static HomeFragment newInstance(String param1) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public HomeFragment() {

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
        initView();
        banner.setImageLoader(new GlideImageLoader());
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/3.png");
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/1.png");
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/2.png");
        banner.setImages(bannerImageList);
        banner.start();

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.home_backup;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    private void initView() {
        //recyclerView.setLayoutManager(new LinearLayoutManager(HomeFragment.this.getActivity()));//这里用线性显示 类似于listview
       /* xSwipeRefreshLayout.setColorSchemeColors(
                  getResources().getColor(R.color.gplus_color_1),
                  getResources().getColor(R.color.gplus_color_2),
                  getResources().getColor(R.color.gplus_color_3),
                  getResources().getColor(R.color.gplus_color_4));
        xSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

            }
        });*/
       // recyclerView.setAdapter(new HotStockRecommendAdapter(HomeFragment.this.getActivity()));
    }
}
