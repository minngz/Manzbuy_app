package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailWriteReviewRecyclerViewAdapter extends RecyclerView.Adapter<DetailWriteReviewRecyclerViewAdapter.ViewHolder> {

    private ArrayList<DetailWriteReviewItem> detailWriteReviewItems;
    private Context context;

    public DetailWriteReviewRecyclerViewAdapter(ArrayList<DetailWriteReviewItem> detailWriteReviewItems, Context context) {
        this.detailWriteReviewItems = detailWriteReviewItems;
        this.context = context;
    }

    @NonNull
    @Override
    public DetailWriteReviewRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.detail_review_item_cardview, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailWriteReviewRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.date.setText(detailWriteReviewItems.get(i).getDate());
        viewHolder.id.setText(detailWriteReviewItems.get(i).getId());
        viewHolder.color.setText(detailWriteReviewItems.get(i).getColor());
        viewHolder.size.setText(detailWriteReviewItems.get(i).getSize());
        viewHolder.contents.setText(detailWriteReviewItems.get(i).getContents());

    }

    @Override
    public int getItemCount() {
        return detailWriteReviewItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView date;
        private TextView id;
        private TextView color;
        private TextView size;
        private TextView contents;
        private RatingBar rating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = (TextView)itemView.findViewById(R.id.detail_writeReview_date);
            id = (TextView)itemView.findViewById(R.id.detail_writeReview_id);
            color = (TextView)itemView.findViewById(R.id.detail_writeReview_color);
            size = (TextView)itemView.findViewById(R.id.detail_writeReview_size);
            contents = (TextView)itemView.findViewById(R.id.detail_writeReview_contents);
            rating = (RatingBar)itemView.findViewById(R.id.deatil_writeReview_ratingBar);
        }

        @Override
        public void onClick(View v) {

        }

    }
}
