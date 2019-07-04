package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class HomePagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public HomePagerAdapter(FragmentManager fm, int pageCount){
        super(fm);
        this.mPageCount = pageCount;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                NewFragment newFragment = new NewFragment();
                return newFragment;
            case 2:
                BestFragment bestFragment = new BestFragment();
                return bestFragment;
            case 3:
                EventFragment eventFragment = new EventFragment();
                return eventFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
