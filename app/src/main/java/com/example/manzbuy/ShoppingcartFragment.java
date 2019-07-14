package com.example.manzbuy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ShoppingcartFragment extends Fragment {

    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private ArrayList<ShoppingcartItem> shoppingcartItems;
    private ArrayList<ShoppingcartTextItem> shoppingcartTextItems;
    private ShoppingcartItemRecyclerViewAdapter itemRecyclerViewAdapter;
    private ShoppingcartTextItemRecyclerViewAdapter textItemRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shoppingcart_frame_fragment, container, false);

        recyclerView1 = (RecyclerView)view.findViewById(R.id.shoppingcart_frame_item_recyclerview);
        recyclerView2 = (RecyclerView)view.findViewById(R.id.shoppingcart_frame_item_sum_recyclerview);

        itemRecyclerViewAdapter = new ShoppingcartItemRecyclerViewAdapter(shoppingcartItems, this.getContext());
        textItemRecyclerViewAdapter = new ShoppingcartTextItemRecyclerViewAdapter(shoppingcartTextItems, this.getContext());


        return view;
    }
}
