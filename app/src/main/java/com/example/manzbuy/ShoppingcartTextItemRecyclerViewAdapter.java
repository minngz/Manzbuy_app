package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingcartTextItemRecyclerViewAdapter extends RecyclerView.Adapter<ShoppingcartTextItemRecyclerViewAdapter.ViewHolder> {
    private ArrayList<ShoppingcartTextItem> items;
    private Context context;

    public ShoppingcartTextItemRecyclerViewAdapter(ArrayList<ShoppingcartTextItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ShoppingcartTextItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.cardview_shoppingcart_item, viewGroup, false);
        return new ShoppingcartTextItemRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingcartTextItemRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.contents.setText(items.get(i).getContents());
        viewHolder.sum.setText(items.get(i).getSum());
        viewHolder.data.setText(items.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView contents;
        private TextView sum;
        private TextView data;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contents = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_text_item1);
            sum = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_text_item2);
            data = (TextView)itemView.findViewById(R.id.cardview_shoppingcart_text_item3);
        }
    }
}
