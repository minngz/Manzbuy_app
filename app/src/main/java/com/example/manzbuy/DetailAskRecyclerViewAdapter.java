package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DetailAskRecyclerViewAdapter extends RecyclerView.Adapter<DetailAskRecyclerViewAdapter.ViewHolder> {

    private ArrayList<DetailAskItem> detailAskItems;
    private Context context;

    public DetailAskRecyclerViewAdapter(ArrayList<DetailAskItem> detailAskItems, Context context) {
        this.detailAskItems = detailAskItems;
        this.context = context;
    }


    @NonNull
    @Override
    public DetailAskRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.detail_ask_item_cardview, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAskRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.date.setText(detailAskItems.get(i).getDate());
        viewHolder.id.setText(detailAskItems.get(i).getId());
        viewHolder.contents.setText(detailAskItems.get(i).getContents());
        viewHolder.answer.setText(detailAskItems.get(i).getAnswer());

    }

    @Override
    public int getItemCount() {
        return detailAskItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView date;
        private TextView id;
        private TextView contents;
        private TextView answer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = (TextView)itemView.findViewById(R.id.detail_writeAsk_date);
            id = (TextView)itemView.findViewById(R.id.detail_writeAsk_id);
            contents = (TextView)itemView.findViewById(R.id.detail_writeAsk_contents);
            answer = (TextView)itemView.findViewById(R.id.detail_writeAsk_answer);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
