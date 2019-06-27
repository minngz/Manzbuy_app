package com.example.manzbuy;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RecentFragment extends Fragment {
    private Context context;
    private ArrayList<String> recentArray;

    private RecentAdapter recentAdapter;
    private ListView listview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_recent_fragment, container, false);

        recentAdapter = new RecentAdapter(this.getContext(), recentArray);
        listview = (ListView)view.findViewById(R.id.recent_listview);
        listview.setAdapter(recentAdapter);
        return view;
    }
}
