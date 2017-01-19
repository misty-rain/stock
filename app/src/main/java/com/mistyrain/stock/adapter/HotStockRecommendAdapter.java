package com.mistyrain.stock.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mistyrain.stock.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by mistyrain on 12/01/2017.
 * 首页热股推荐适配器
 */

public class HotStockRecommendAdapter extends RecyclerView.Adapter<HotStockRecommendAdapter.NormalTextViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private String[] mTitles;

    public HotStockRecommendAdapter(Context context) {
        mTitles = new String[]{"德国FDAX", "11089", "+20.9%", "222"};
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NormalTextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NormalTextViewHolder(mLayoutInflater.inflate(R.layout.homestockrecommend_list_itme, parent, false));
    }

    @Override
    public void onBindViewHolder(NormalTextViewHolder holder, int position) {
        holder.mTxtHeadTitle.setText(mTitles[position]);
        holder.mTxtCurrentPrice.setText(mTitles[position]);
        holder.mTxtIncrease.setText(mTitles[position]);
        holder.mTxtTurnover.setText(mTitles[position]);
    }

    @Override
    public int getItemCount() {
        return mTitles == null ? 0 : mTitles.length;
    }

    public static class NormalTextViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.hotstock_item_head_title)
        TextView mTxtHeadTitle;
        @InjectView(R.id.hotstock_item_current_price)
        TextView mTxtCurrentPrice;
        @InjectView(R.id.hotstock_item_increase)
        TextView mTxtIncrease;
        @InjectView(R.id.hotstock_item_turnover)
        TextView mTxtTurnover;

        NormalTextViewHolder(View view) {
            super(view);
            ButterKnife.inject(this, view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("NormalTextViewHolder", "onClick--> position = " + getPosition());
                }
            });
        }
    }
}
