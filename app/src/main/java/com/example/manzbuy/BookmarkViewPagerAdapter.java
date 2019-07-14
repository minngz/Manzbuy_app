package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class BookmarkViewPagerAdapter extends FragmentStatePagerAdapter {

    private int mPageCount;

    private BookmarkItemFragment itemFragment;
    private BookmarkMarketFragment marketFragment;

    public BookmarkViewPagerAdapter(FragmentManager fm, int mPageCount) {
        super(fm);
        this.mPageCount = mPageCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                itemFragment = new BookmarkItemFragment();
                return itemFragment;
            case 1:
                marketFragment = new BookmarkMarketFragment();
                return marketFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
