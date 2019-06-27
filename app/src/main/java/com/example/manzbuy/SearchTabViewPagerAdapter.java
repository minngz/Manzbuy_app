package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.ListView;

public class SearchTabViewPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    private RecommandFragment recommandFragment;
    private RecentFragment recentFragment;

    public SearchTabViewPagerAdapter(FragmentManager fm, int mPageCount) {
        super(fm);
        this.mPageCount = mPageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                recommandFragment = new RecommandFragment();
                return recommandFragment;
            case 1:
                recentFragment = new RecentFragment();
                return recentFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
