package com.mistyrain.stock.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mistyrain.stock.R;
import com.mistyrain.stock.adapter.BaseFragmentAdapter;
import com.mistyrain.stock.config.Constants;
import com.mistyrain.stock.fragment.ContractFragment;
import com.mistyrain.stock.fragment.HomeFragment;
import com.mistyrain.stock.fragment.InterActionFragment;
import com.mistyrain.stock.fragment.MineFragment;
import com.mistyrain.stock.fragment.SpreadFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class BaseFragment extends Fragment implements TabLayout.OnTabSelectedListener {


    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private TextView mTextView;
    private List<String> mTabList = new ArrayList<>();
    private BaseFragmentAdapter mAdapter;
    private int[] mTabImgs = new int[]{R.mipmap.tab_home_icon, R.mipmap.tab_contract_icon, R.mipmap.tab_interaction_icon, R.mipmap.tab_spread_icon,R.mipmap.tab_mine_icon};
    private List<Fragment> mFragments = new ArrayList<>();

    public static BaseFragment newInstance(String s) {
        BaseFragment tabLayoutFragment = new BaseFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.ARGS, s);
        tabLayoutFragment.setArguments(bundle);
        return tabLayoutFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tablayout, container, false);
        mTextView = (TextView) view.findViewById(R.id.activity_text_view);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String s = bundle.getString(Constants.ARGS);
            if (!TextUtils.isEmpty(s)) {
                mTextView.setText(s);
            }
        }
        mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        initTabList();
        mAdapter = new BaseFragmentAdapter(getChildFragmentManager(), mTabList, getActivity(), mFragments, mTabImgs);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setCurrentItem(0);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.addOnTabSelectedListener(this);
        mTabLayout.getTabAt(0).setIcon(R.mipmap.tab_home_selected);
        mTabLayout.getTabAt(1).setIcon(R.mipmap.tab_contract_selected);
        mTabLayout.getTabAt(2).setIcon(R.mipmap.tab_interaction_selected);
        mTabLayout.getTabAt(3).setIcon(R.mipmap.tab_spread_selected);
        mTabLayout.getTabAt(4).setIcon(R.mipmap.tab_mine_selected);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        initFragmentList();
    }

    private void setDefaultFragment() {
        getChildFragmentManager().beginTransaction()
                  .replace(R.id.sub_content, HomeFragment.newInstance(getString(R.string.tab_item_home)))
                  .commit();
    }

    /**
     * add Fragment
     */
    public void initFragmentList() {
        mFragments.clear();
        mFragments.add(HomeFragment.newInstance(getString(R.string.tab_item_home)));
        mFragments.add(ContractFragment.newInstance(getString(R.string.tab_item_contract)));
        mFragments.add(InterActionFragment.newInstance(getString(R.string.tab_item_interaction)));
        mFragments.add(SpreadFragment.newInstance(getString(R.string.tab_item_spread)));
        mFragments.add(MineFragment.newInstance(getString(R.string.tab_item_mine)));

    }

    /**
     * init the tab list.
     */
    private void initTabList() {
        mTabList.clear();
        mTabList.add(getString(R.string.tab_item_home));
        mTabList.add(getString(R.string.tab_item_contract));
        mTabList.add(getString(R.string.tab_item_interaction));
        mTabList.add(getString(R.string.tab_item_spread));
        mTabList.add(getString(R.string.tab_item_mine));
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
//        setTabSelectedState(tab);
        resetTabIcon();
        int position = tab.getPosition();
        Log.e("Kevin", "position--->" + position);
        switch (position) {
            case 0:
                tab.setIcon(R.mipmap.tab_home_selected);
                break;
            case 1:
                tab.setIcon(R.mipmap.tab_contract_selected);
                break;
            case 2:
                tab.setIcon(R.mipmap.tab_interaction_selected);
                break;
            case 3:
                tab.setIcon(R.mipmap.tab_spread_selected);
                break;
            case 4:
                tab.setIcon(R.mipmap.tab_mine_selected);
                break;

        }
    }

    private void resetTabIcon() {
        mTabLayout.getTabAt(0).setIcon(R.mipmap.tab_home_icon);
        mTabLayout.getTabAt(1).setIcon(R.mipmap.tab_contract_icon);
        mTabLayout.getTabAt(2).setIcon(R.mipmap.tab_interaction_icon);
        mTabLayout.getTabAt(3).setIcon(R.mipmap.tab_spread_icon);
        mTabLayout.getTabAt(4).setIcon(R.mipmap.tab_mine_icon);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
//        setTabUnSelectedState(tab);
    }


    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    private void setTabSelectedState(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        TextView tabText = (TextView) customView.findViewById(R.id.tv_tab_text);
        ImageView tabIcon = (ImageView) customView.findViewById(R.id.iv_tab_icon);
        tabText.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
        String s = tabText.getText().toString();
        if (getString(R.string.tab_item_home).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_home_selected);
        } else if (getString(R.string.tab_item_contract).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_contract_selected);
        } else if (getString(R.string.tab_item_interaction).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_interaction_selected);
        } else if (getString(R.string.tab_item_spread).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_spread_selected);
        } else if (getString(R.string.tab_item_mine).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_mine_selected);
        }
    }

    private void setTabUnSelectedState(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        TextView tabText = (TextView) customView.findViewById(R.id.tv_tab_text);
        ImageView tabIcon = (ImageView) customView.findViewById(R.id.iv_tab_icon);
        tabText.setTextColor(ContextCompat.getColor(getActivity(), R.color.black_1));
        String s = tabText.getText().toString();
        if (getString(R.string.tab_item_home).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_home_icon);
        } else if (getString(R.string.tab_item_contract).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_contract_icon);
        } else if (getString(R.string.tab_item_interaction).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_interaction_icon);
        } else if (getString(R.string.tab_item_spread).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_spread_icon);
        }
        else if (getString(R.string.tab_item_mine).equals(s)) {
            tabIcon.setImageResource(R.mipmap.tab_mine_icon);
        }
    }

}
