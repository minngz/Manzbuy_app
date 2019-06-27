package com.example.manzbuy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RecentAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> recentArray;

    private ViewHolder mViewHolder;

    public RecentAdapter(Context context, ArrayList<String> recentArray) {
        this.context = context;
        this.recentArray = recentArray;
    }

    @Override
    public int getCount() {
        return recentArray.size();
    }

    @Override
    public Object getItem(int position) {
        return recentArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.recent_listview_item, parent, false);
            mViewHolder = new ViewHolder(convertView);
            convertView.setTag(mViewHolder);
        }
        else
        {
            mViewHolder = (ViewHolder)convertView.getTag();
        }

        mViewHolder.item.setText(recentArray.get(position));

        return convertView;
    }

    public class ViewHolder{
        private TextView item;

        public ViewHolder(View convertView){
            item = (TextView)convertView.findViewById(R.id.recent_item_name);
        }
    }
}
