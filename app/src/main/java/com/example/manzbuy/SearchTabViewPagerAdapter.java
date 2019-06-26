package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SearchTabViewPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public SearchTabViewPagerAdapter(FragmentManager fm, int mPageCount) {
        super(fm);
        this.mPageCount = mPageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                break;
            case 1:
                break;

            default:
                return null;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
