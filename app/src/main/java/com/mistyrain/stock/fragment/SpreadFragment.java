package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mistyrain.stock.R;

/**
 * 推广
 * Created by mistyrain on 10/01/2017.
 */

public class SpreadFragment extends Fragment {

    public static SpreadFragment newInstance(String param1) {
        SpreadFragment fragment = new SpreadFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public SpreadFragment() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.spread, container, false);
        return view;
    }
}
