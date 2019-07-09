package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MarketRecyclerViewAdapter extends RecyclerView.Adapter<MarketRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Market> markets;
    private Context marketContext;
    private MarketFragment fragment;

    public MarketRecyclerViewAdapter(ArrayList<Market> markets, Context marketContext, MarketFragment fragment) {
        this.markets = markets;
        this.marketContext = marketContext;
        this.fragment = fragment;
    }

    public MarketRecyclerViewAdapter(ArrayList<Market> markets, Context marketContext) {
        this.markets = markets;
        this.marketContext = marketContext;
    }

    public MarketRecyclerViewAdapter(ArrayList<Market> markets) {
        this.markets = markets;
    }

    @NonNull
    @Override
    public MarketRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(marketContext);
        view = layoutInflater.inflate(R.layout.cardview_market, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MarketRecyclerViewAdapter.ViewHolder myViewHolder, int position) {

        myViewHolder.tv_marketName.setText(markets.get(position).getMarketName());
        myViewHolder.tv_marketTag1.setText(markets.get(position).getMarketTag1());
        myViewHolder.tv_marketTag2.setText(markets.get(position).getMarketTag2());

    }

    @Override
    public int getItemCount() {
        return markets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv_marketName;
        TextView tv_marketTag1;
        TextView tv_marketTag2;
        ImageView marketImage1;
        ImageView marketImage2;
        ImageView marketImage3;
        Button marketBookmark;

        private DetailMarketTabFragment detailMarketTabFragment = new DetailMarketTabFragment();

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_marketName = (TextView)itemView.findViewById(R.id.market_name_id);
            tv_marketTag1 = (TextView)itemView.findViewById(R.id.market_tag_name_1);
            tv_marketTag2 = (TextView)itemView.findViewById(R.id.market_tag_name_2);
            marketImage1 = (ImageView)itemView.findViewById(R.id.market_image_1);
            marketImage2 = (ImageView)itemView.findViewById(R.id.market_image_2);
            marketImage3 = (ImageView)itemView.findViewById(R.id.market_image_3);
            marketBookmark = (Button)itemView.findViewById(R.id.market_bookmark_id);
        }

        @Override
        public void onClick(View v) {
//            fragmentLayout -> MainActivity에서 fragment가 나오는 공간의 frame 부분임.
//            fragment.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayout, detailMarketTabFragment).commitAllowingStateLoss();
        }
    }
}
