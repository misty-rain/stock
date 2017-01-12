package com.mistyrain.stock.ui.main;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mistyrain.stock.R;
import com.mistyrain.stock.base.BaseFragment;

public class MainActivity extends FragmentActivity {


    private ViewPager mViewPager;
    private BaseFragment baseFragment;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // ((AppCompatActivity)MainActivity.this.getParent()).getSupportActionBar().hide();
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
