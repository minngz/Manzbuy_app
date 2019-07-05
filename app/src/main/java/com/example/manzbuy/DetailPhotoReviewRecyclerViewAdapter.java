package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class DetailPhotoReviewRecyclerViewAdapter extends RecyclerView.Adapter<DetailPhotoReviewRecyclerViewAdapter.ViewHolder> {

    private ArrayList<DetailPhotoReviewItem> detailPhotoReviewItems;
    private Context context;

    public DetailPhotoReviewRecyclerViewAdapter(ArrayList<DetailPhotoReviewItem> detailPhotoReviewItems, Context context) {
        this.detailPhotoReviewItems = detailPhotoReviewItems;
        this.context = context;
    }

    @NonNull
    @Override
    public DetailPhotoReviewRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.detail_review_photo_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailPhotoReviewRecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return detailPhotoReviewItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView)itemView.findViewById(R.id.detail_photoReview_recyclerView_image);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
