package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MarketDetailViewPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    private DetailMarketItemFragment itemFragment;
    private DetailMarketReviewFragment reviewFragment;
    private DetailMarketAskFragment askFragment;
    private DetailMarketNoteFragment noteFragment;

    public MarketDetailViewPagerAdapter(FragmentManager fm, int mPageCount) {
        super(fm);
        this.mPageCount = mPageCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                // 상품 탭
                itemFragment = new DetailMarketItemFragment();
                return itemFragment;
            case 1:
                // 후기 탭
                reviewFragment = new DetailMarketReviewFragment();
                return reviewFragment;
            case 2:
                // 문의 탭
                askFragment = new DetailMarketAskFragment();
                return askFragment;
            case 3:
                // 공지 탭
                noteFragment = new DetailMarketNoteFragment();
                return noteFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
