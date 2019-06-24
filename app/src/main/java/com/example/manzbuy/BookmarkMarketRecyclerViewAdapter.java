package com.example.manzbuy;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class BookmarkMarketRecyclerViewAdapter extends RecyclerView.Adapter<BookmarkMarketRecyclerViewAdapter.ViewHolder> {

    public BookmarkMarketRecyclerViewAdapter() {
    }

    @NonNull
    @Override
    public BookmarkMarketRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkMarketRecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
