package com.example.manzbuy;

import android.annotation.SuppressLint;
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
import java.util.zip.Inflater;

public class RecommandFragment extends Fragment {

    private Context context;
    private ArrayList<String> recommandArray;

    private RecommandAdapter recommandAdapter;
    private ListView listview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_recommand_fragment, container, false);

        recommandAdapter = new RecommandAdapter(this.getContext(), recommandArray);
        listview = (ListView)view.findViewById(R.id.recommand_listview);
        listview.setAdapter(recommandAdapter);
        return view;
    }
}
