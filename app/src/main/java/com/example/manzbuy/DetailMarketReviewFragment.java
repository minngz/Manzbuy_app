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

public class DetailMarketReviewFragment extends Fragment {

    private RecyclerView photoRecyclerView;
    private RecyclerView writeRecyclerView;
    private ArrayList<DetailPhotoReviewItem> detailPhotoReviewItems;
    private ArrayList<DetailWriteReviewItem> detailWriteReviewItems;
    private DetailPhotoReviewRecyclerViewAdapter photoReviewRecyclerViewAdapter;
    private DetailWriteReviewRecyclerViewAdapter writeReviewRecyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_review_fragment, container, false);

        createPhotoReview(view);
        createWriteReview(view);

        return view;
    }

    private void createPhotoReview(View view){
        detailPhotoReviewItems = new ArrayList<DetailPhotoReviewItem>();
        photoRecyclerView = (RecyclerView)view.findViewById(R.id.detail_photoReview_recyclerView);
        layoutManager = new LinearLayoutManager(this.getContext());
        photoRecyclerView.setLayoutManager(layoutManager);
        photoReviewRecyclerViewAdapter = new DetailPhotoReviewRecyclerViewAdapter(detailPhotoReviewItems, getActivity());
        photoRecyclerView.setAdapter(photoReviewRecyclerViewAdapter);
    }

    private void createWriteReview(View view){
        detailWriteReviewItems = new ArrayList<DetailWriteReviewItem>();
        writeRecyclerView = (RecyclerView)view.findViewById(R.id.detail_writeReview_recyclerView);
        layoutManager = new LinearLayoutManager(this.getContext());
        writeRecyclerView.setLayoutManager(layoutManager);
        writeReviewRecyclerViewAdapter = new DetailWriteReviewRecyclerViewAdapter(detailWriteReviewItems, getActivity());
        writeRecyclerView.setAdapter(writeReviewRecyclerViewAdapter);
    }
}
