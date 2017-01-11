package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mistyrain.stock.R;
import com.mistyrain.stock.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class HomeFragment extends Fragment {
    Banner banner;
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
        banner = (Banner) view.findViewById(R.id.banner);
        banner.setImageLoader(new GlideImageLoader());
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/3.png");
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/1.png");
        bannerImageList.add("https://raw.githubusercontent.com/youth5201314/banner/master/image/2.png");
        banner.setImages(bannerImageList);
        banner.start();
        return view;
    }
}
