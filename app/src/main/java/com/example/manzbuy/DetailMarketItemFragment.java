package com.example.manzbuy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DetailMarketItemFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<DetailMarketItemArray> itemArrays;
    private RecyclerView.LayoutManager layoutManager;
    private DetailMarketItemRecyclerViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_detail_fragment, container, false);

        itemArrays = new ArrayList<DetailMarketItemArray>();
        recyclerView = (RecyclerView)view.findViewById(R.id.market_detailpage_itemRecyclerView);
        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new DetailMarketItemRecyclerViewAdapter(itemArrays, getActivity());
        recyclerView.setAdapter(adapter);


        return view;
    }
}
