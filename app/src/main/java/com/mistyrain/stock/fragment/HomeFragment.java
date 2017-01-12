package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mistyrain.stock.R;
import com.mistyrain.stock.adapter.HotStockRecommendAdapter;
import com.mistyrain.stock.utils.GlideImageLoader;
import com.mistyrain.stock.widget.XSwipeRefreshLayout;
import com.youth.banner.Banner;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class HomeFragment extends Fragment {
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.swipe_layout)
    XSwipeRefreshLayout xSwipeRefreshLayout;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        ButterKnife.bind(this,view);
        initView();
        banner.setImageLoader(new GlideImageLoader());
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/3.png");
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/1.png");
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/2.png");
        banner.setImages(bannerImageList);
        banner.start();
        return view;
    }

    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(HomeFragment.this.getActivity()));//这里用线性显示 类似于listview
        xSwipeRefreshLayout.setColorSchemeColors(
                  getResources().getColor(R.color.gplus_color_1),
                  getResources().getColor(R.color.gplus_color_2),
                  getResources().getColor(R.color.gplus_color_3),
                  getResources().getColor(R.color.gplus_color_4));
        xSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

            }
        });
        recyclerView.setAdapter(new HotStockRecommendAdapter(HomeFragment.this.getActivity()));
    }
}
