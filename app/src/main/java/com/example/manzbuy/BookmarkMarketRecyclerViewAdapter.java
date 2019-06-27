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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BookmarkMarketRecyclerViewAdapter extends RecyclerView.Adapter<BookmarkMarketRecyclerViewAdapter.ViewHolder> {

    private ArrayList<BookmarkMarket> bookmarkMarkets;
    private Context bookmarkMarketContext;

    public BookmarkMarketRecyclerViewAdapter(ArrayList<BookmarkMarket> bookmarkMarkets, Context bookmarkMarketContext) {
        this.bookmarkMarkets = bookmarkMarkets;
        this.bookmarkMarketContext = bookmarkMarketContext;
    }

    @NonNull
    @Override
    public BookmarkMarketRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(bookmarkMarketContext);
        view = layoutInflater.inflate(R.layout.cardview_market_bookmark, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkMarketRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_marketName.setText(bookmarkMarkets.get(i).getMarketName());
        viewHolder.tv_marketTag1.setText(bookmarkMarkets.get(i).getMarketTagName1());
        viewHolder.tv_marketTag2.setText(bookmarkMarkets.get(i).getMarketTagName2());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tv_marketName;
        TextView tv_marketTag1;
        TextView tv_marketTag2;
        ImageView marketImage;
        CheckBox marketBookmark;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_marketName = (TextView)itemView.findViewById(R.id.bookmark_marketName);
            tv_marketTag1 = (TextView)itemView.findViewById(R.id.bookmark_market_tag_name_1);
            tv_marketTag2 = (TextView)itemView.findViewById(R.id.bookmark_market_tag_name_2);
            marketImage = (ImageView)itemView.findViewById(R.id.bookmark_market_image);
            marketBookmark = (CheckBox)itemView.findViewById(R.id.market_bookmark_id);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
