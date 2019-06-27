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

public class BookmarkItemRecyclerViewAdapter extends RecyclerView.Adapter<BookmarkItemRecyclerViewAdapter.ViewHolder> {

    private ArrayList<BookmarkItem> bookmarkItems;
    private Context bookmarkItemContext;

    public BookmarkItemRecyclerViewAdapter(ArrayList<BookmarkItem> bookmarkItems, Context bookmarkItemContext) {
        this.bookmarkItems = bookmarkItems;
        this.bookmarkItemContext = bookmarkItemContext;
    }

    @NonNull
    @Override
    public BookmarkItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(bookmarkItemContext);
        view = layoutInflater.inflate(R.layout.cardview_item_bookmark, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkItemRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_marketName.setText(bookmarkItems.get(i).getMarketName());
        viewHolder.tv_itemName.setText(bookmarkItems.get(i).getItemName());
        viewHolder.tv_itemPrice.setText(bookmarkItems.get(i).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return bookmarkItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv_marketName;
        TextView tv_itemName;
        TextView tv_itemPrice;
        ImageView itemImage;
        ImageView itemMarketImage;
        CheckBox itemBookmark;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_marketName = (TextView)itemView.findViewById(R.id.item_bookmark_marketName);
            tv_itemName = (TextView)itemView.findViewById(R.id.itemName_bookmark);
            tv_itemPrice = (TextView)itemView.findViewById(R.id.itemPrice_bookmark);
            itemImage = (ImageView)itemView.findViewById(R.id.item_bookmark_image);
            itemMarketImage = (ImageView)itemView.findViewById(R.id.item_bookmark_market_image);
            itemBookmark = (CheckBox)itemView.findViewById(R.id.item_bookmark_id);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
