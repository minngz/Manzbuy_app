package com.example.manzbuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonEventListener implements OnClickListener{

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private MainActivity mainActivity;
    private Fragment fragment;

    private SearchTabFragment searchTabFragment;
    private MypageLoginFragment mypageLoginFragment;

    public ButtonEventListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        fragmentManager = mainActivity.getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
    }
    public ButtonEventListener(Fragment fragment){
        this.fragment = fragment;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_search_btn :
                // search 화면에 있는 검색 버튼
                break;
            case R.id.search_more_btn :
                // 검색 결과 화면에 있는 검색 버튼
                break;
            case R.id.login_btn :
                // 마이 페이지 화면에 있는 로그인 버튼
                mypageLoginFragment = new MypageLoginFragment();
                Log.d("TAG", "호잇");
//                fragment.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentLayout, mypageLoginFragment).commitAllowingStateLoss();
                break;
            case R.id.signUp_btn :
                // 마이 페이지 화면에 있는 회원가입 버튼
                break;
            case R.id.noSignUp_btn :
                // 마이 페이지 화면에 있는 비회원 버튼
                break;
            case R.id.login_page_btn :
                // 마이 페이지 화면에 있는 로그인 버튼을 누른 다음 화면의 로그인 버튼
                break;
            case R.id.search :
                // 메인 틀 화면에 있는 검색 이미지 버튼
                searchTabFragment = new SearchTabFragment();
                transaction = fragmentManager.beginTransaction();
//                transaction.replace(R.id.fragmentLayout, searchTabFragment).commitAllowingStateLoss();
                break;
            case R.id.shoppingCart :
                // 메인 틀 화면에 있는 장바구니 버튼
                break;
            default:
                break;

        }
    }
}
