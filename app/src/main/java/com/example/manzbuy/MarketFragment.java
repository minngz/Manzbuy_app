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

public class MarketFragment extends Fragment {

    private RecyclerView recyclerView;
    private MarketRecyclerViewAdapter marketRecyclerViewAdapter;
    private ArrayList<Market> marketArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.market_fragment, container, false);
        /*
        recyclerView = (RecyclerView) view.findViewById(R.id.market_recyclerView);
        marketRecyclerViewAdapter = new MarketRecyclerViewAdapter(marketArrayList);
        recyclerView.setAdapter(marketRecyclerViewAdapter);
        */
        return view;
    }
}
