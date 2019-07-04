package com.example.manzbuy;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private ViewPager viewPager;
    public HomeFragment(){
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_home, container, false);
        viewPager = view.findViewById(R.id.event_viewpager);
        //viewPager.setAdapter(new MyAdapter(this.getContext()));
        return view;
    }

    private class MyAdapter extends BaseAdapter{
        private ArrayList<ImageView> imageList;
        private Context context;

        public MyAdapter(Context context){
            this.context = context;
            imageList = new ArrayList<>();
            //imageList.add(); 이미지 삽입
        }
        @Override
        public int getCount() {
            return imageList.size();
        }

        @Override
        public Object getItem(int position) {
            return imageList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if ( convertView == null ) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                //convertView = inflater.inflate(R.layout.list_item, parent, false);
            }
            ImageView imageView = convertView.findViewById(R.id.eventImage);
            imageView.setOnClickListener(new ImageView.OnClickListener(){
                @Override
                public void onClick(View v) {

                }
            });
            return convertView;
        }
    }
}
