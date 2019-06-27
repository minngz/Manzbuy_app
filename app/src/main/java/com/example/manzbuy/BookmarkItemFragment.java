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

public class BookmarkItemFragment extends Fragment {

    private RecyclerView recyclerView;
    private BookmarkItemRecyclerViewAdapter itemRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<BookmarkItem> itemArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bookmark_item_fragment, container, false);
        itemArrayList = new ArrayList<BookmarkItem>();

        recyclerView = (RecyclerView) view.findViewById(R.id.bookmark_item_recyclerView);
        layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        itemRecyclerViewAdapter = new BookmarkItemRecyclerViewAdapter(itemArrayList, getActivity());
        recyclerView.setAdapter(itemRecyclerViewAdapter);

        return view;
    }
}
