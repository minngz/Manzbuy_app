package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ItemDetailViewPagerAdapter extends FragmentStatePagerAdapter {

    private int mPageCount;

    private ItemDetailInfoFragment infoFragment;
    private ItemDetailReviewFragment reviewFragment;
    private ItemDetailAskFragment askFragment;
    private ItemDetailNoteFragment noteFragment;

    public ItemDetailViewPagerAdapter(FragmentManager fm, int mPageCount) {
        super(fm);
        this.mPageCount = mPageCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                // 설명 탭
                infoFragment = new ItemDetailInfoFragment();
                return infoFragment;
            case 1:
                // 후기 탭
                reviewFragment = new ItemDetailReviewFragment();
                return reviewFragment;
            case 2:
                // 문의 탭
                askFragment = new ItemDetailAskFragment();
                return askFragment;
            case 3:
                // 공지 탭
                noteFragment = new ItemDetailNoteFragment();
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
