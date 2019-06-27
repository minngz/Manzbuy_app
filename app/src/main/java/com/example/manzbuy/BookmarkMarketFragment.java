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

public class BookmarkMarketFragment extends Fragment {
    private RecyclerView recyclerView;
    private BookmarkMarketRecyclerViewAdapter marketRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<BookmarkMarket> markets;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bookmark_market_fragment, container, false);
        markets = new ArrayList<BookmarkMarket>();

        recyclerView = (RecyclerView) view.findViewById(R.id.bookmark_market_recyclerView);
        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        marketRecyclerViewAdapter = new BookmarkMarketRecyclerViewAdapter(markets, getActivity());
        recyclerView.setAdapter(marketRecyclerViewAdapter);
        return view;
    }
}
