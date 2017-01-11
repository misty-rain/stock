package com.mistyrain.stock.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mistyrain.stock.R;

/**
 * Created by mistyrain on 10/01/2017.
 */

public class InterActionFragment extends Fragment {

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.interaction, container, false);
        return view;
    }
}
