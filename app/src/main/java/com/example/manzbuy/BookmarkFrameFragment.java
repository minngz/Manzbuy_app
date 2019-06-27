package com.example.manzbuy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class BookmarkFrameFragment extends Fragment {

    private FragmentManager fragmentManager = getFragmentManager();
    private BookmarkItemFragment itemFragment = new BookmarkItemFragment();
    private BookmarkMarketFragment marketFragment = new BookmarkMarketFragment();

    private FragmentTransaction transaction;

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.bookmark_item_menu :
                    transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.bookmark_fragment_layout, itemFragment);
                    break;
                case R.id.bookmark_market_menu :
                    transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.bookmark_fragment_layout, marketFragment);
                    break;
            }
            return true;
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bookmark_frame_fragment, null);
        BottomNavigationView bottomNavigationView =  this.getView().findViewById(R.id.bookmark_nav_view);

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.bookmark_fragment_layout, itemFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        return view;
    }
}
