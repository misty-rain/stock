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

public class ContractFragment extends Fragment {

    public static ContractFragment newInstance(String param1) {
        ContractFragment fragment = new ContractFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public ContractFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contract, container, false);
        return view;
    }
}
