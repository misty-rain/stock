package com.mistyrain.stock;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mistyrain.stock.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {


    private ViewPager mViewPager;
    private BaseFragment baseFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        initViews();
    }


    private void initViews() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (baseFragment == null) {
            baseFragment = baseFragment.newInstance("hello");
        }
        transaction.replace(R.id.frame_content, baseFragment);
        transaction.commit();
    }

}
