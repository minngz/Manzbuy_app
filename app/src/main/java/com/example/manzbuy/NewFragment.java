package com.example.manzbuy;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewFragment extends Fragment {
    private GridView gridView;
    ArrayList<Bitmap> picArr = new ArrayList<Bitmap>(); //이미지 배열
    ArrayList<String> marketArr = new ArrayList<String>();

    public NewFragment(){
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bitmap bm1 = BitmapFactory.decodeResource(getResources(), R.drawable.a);
        //picArr.add(bm1);

    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_new, container, false);
        gridView = (GridView) view.findViewById(R.id.new_gridview);
        gridView.setAdapter(new GridAdapter());
        return view;
    }

    public class GridAdapter extends BaseAdapter {
        LayoutInflater inflater;

        public GridAdapter() {
            inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return picArr.size();
        }

        @Override
        public Object getItem(int position) {
            return picArr.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null) {
                convertView = inflater.inflate(R.layout.new_grid_layout, parent, false);
            }
            ImageView clotheImage = convertView.findViewById(R.id.new_clothes);
            ImageView marketImage = convertView.findViewById(R.id.new_market);
            TextView marketName = convertView.findViewById(R.id.new_market_name);
            TextView clotheName = convertView.findViewById(R.id.new_clothe_name);
            TextView price = convertView.findViewById(R.id.new_clothe_price);

            clotheImage.setImageBitmap(picArr.get(position));
            marketName.setText(marketArr.get(position));
            clotheImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //이미지를 터치했을때 동작하는 곳
                }
            });
            return convertView;
        }
    }

}
