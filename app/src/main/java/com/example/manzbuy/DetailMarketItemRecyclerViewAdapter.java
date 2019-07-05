package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailMarketItemRecyclerViewAdapter extends RecyclerView.Adapter<DetailMarketItemRecyclerViewAdapter.ViewHolder> {

    private ArrayList<DetailMarketItemArray> detailMarketItemArrays;
    private Context context;

    public DetailMarketItemRecyclerViewAdapter(ArrayList<DetailMarketItemArray> detailMarketItemArrays, Context context) {
        this.detailMarketItemArrays = detailMarketItemArrays;
        this.context = context;
    }


    @NonNull
    @Override
    public DetailMarketItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cardview_market_detailpage, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailMarketItemRecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return detailMarketItemArrays.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView image;
        private TextView itemName;
        private TextView itemPrice;
        private CheckBox itemBookmark;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.market_detailpage_image);
            itemName = (TextView)itemView.findViewById(R.id.market_detailpage_itemName);
            itemPrice = (TextView)itemView.findViewById(R.id.market_detailpage_itemPrice);
            itemBookmark = (CheckBox)itemView.findViewById(R.id.market_detailpage_itemBookmark);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
