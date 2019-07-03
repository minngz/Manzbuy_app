package com.example.manzbuy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MypageRecyclerViewAdapter extends RecyclerView.Adapter<MypageRecyclerViewAdapter.ItemRowHolder> {

    private ArrayList<MypageSection> data;
    private Context context;

    public MypageRecyclerViewAdapter(ArrayList<MypageSection> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @NonNull
    @Override
    public MypageRecyclerViewAdapter.ItemRowHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mypage_list, null);
        ItemRowHolder rh = new ItemRowHolder(view);
        return rh;
    }

    @Override
    public void onBindViewHolder(@NonNull MypageRecyclerViewAdapter.ItemRowHolder itemRowHolder, int i) {
        final String sectionName = data.get(i).getSectionTitle();
        ArrayList SectionItem = data.get(i).getData();
        itemRowHolder.header.setText(sectionName);

        SectionListAdapter itemAdapter = new SectionListAdapter(SectionItem, context);

        //itemRowHolder.recyclerViewList.setHasFixedSize(true);
        itemRowHolder.recyclerViewList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        itemRowHolder.recyclerViewList.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        itemRowHolder.recyclerViewList.setAdapter(itemAdapter);

    }

    @Override
    public int getItemCount() {
        return (null != data ? data.size() : 0);
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView header;
        protected RecyclerView recyclerViewList;

        public ItemRowHolder(@NonNull View itemView) {
            super(itemView);
            this.header = (TextView)itemView.findViewById(R.id.mypage_section);
            this.recyclerViewList = (RecyclerView)itemView.findViewById(R.id.mypage_list_recyclerView);
        }
    }
}
