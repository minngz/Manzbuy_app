package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SectionListAdapter extends RecyclerView.Adapter<SectionListAdapter.SingleItemHolder> {

    private ArrayList<MypageContentsModel> itemList;
    private Context context;

    public SectionListAdapter(ArrayList<MypageContentsModel> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }


    @NonNull
    @Override
    public SectionListAdapter.SingleItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mypage_list_card, null);
        SingleItemHolder mh = new SingleItemHolder(view);

        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull SectionListAdapter.SingleItemHolder singleItemHolder, int i) {
        MypageContentsModel item = itemList.get(i);
        singleItemHolder.textView.setText(item.getContents());

    }

    @Override
    public int getItemCount() {
        return (null != itemList ? itemList.size() : 0);
    }

    public class SingleItemHolder extends RecyclerView.ViewHolder {

        protected TextView textView;

        public SingleItemHolder(@NonNull View itemView) {
            super(itemView);

            this.textView = (TextView)itemView.findViewById(R.id.mypage_list_card_text);
        }
    }
}
