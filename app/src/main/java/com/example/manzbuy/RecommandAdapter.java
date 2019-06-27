package com.example.manzbuy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RecommandAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> recommandArray;

    private ViewHolder mViewHolder;

    public RecommandAdapter(Context context, ArrayList<String> recommandArray) {
        this.context = context;
        this.recommandArray = recommandArray;
    }

    @Override
    public int getCount() {
        return recommandArray.size();
    }

    @Override
    public Object getItem(int position) {
        return recommandArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.recommand_listview_item, parent, false);
            mViewHolder = new ViewHolder(convertView);
        }
        else
        {
            mViewHolder = (ViewHolder)convertView.getTag();
        }

        mViewHolder.item.setText(recommandArray.get(position));

        return convertView;
    }

    public class ViewHolder{
        private TextView item;

        public ViewHolder(View convertView){
            item = (TextView)convertView.findViewById(R.id.recommand_item_name);
        }
    }
}
