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

public class ShoppingcartItemRecyclerViewAdapter extends RecyclerView.Adapter<ShoppingcartItemRecyclerViewAdapter.ViewHolder> {

    private ArrayList<ShoppingcartItem> items;
    private Context context;

    public ShoppingcartItemRecyclerViewAdapter(ArrayList<ShoppingcartItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ShoppingcartItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cardview_shoppingcart_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingcartItemRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemName.setText(items.get(i).getItemName());
        viewHolder.marketName.setText(items.get(i).getMarketName());
        viewHolder.itemPrice.setText(items.get(i).getItemPrice());
        viewHolder.itemColor.setText(items.get(i).getItemColor());
        viewHolder.itemSize.setText(items.get(i).getItemSize());
        viewHolder.itemNum.setText(items.get(i).getItemNum());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CheckBox checking;
        private ImageView itemImage;
        private TextView itemName;
        private TextView marketName;
        private TextView itemPrice;
        private TextView itemColor;
        private TextView itemSize;
        private TextView itemNum;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            checking = (CheckBox)itemView.findViewById(R.id.cardview_shoppingcart_check);
            itemImage = (ImageView)itemView.findViewById(R.id.cardview_shoppingcart_image);
            itemName = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_itemName);
            marketName = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_marketName);
            itemPrice = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_itemPrice);
            itemColor = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_color);
            itemSize = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_size);
            itemNum = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_number);
        }
    }
}
