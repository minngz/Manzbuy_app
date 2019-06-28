package com.example.manzbuy;

import android.view.View;
import android.widget.Button;

public class ButtonEventListener implements Button.OnClickListener{
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_search_btn :
                // search 화면에 있는 검색 버튼
                break;
            case R.id.search_more_btn :
                // 검색 결과 화면에 있는 검색 버튼
                break;
            case R.id.login_page_btn :
                // 마이 페이지 화면에 있는 로그인 버튼
                break;
            case R.id.signUp_btn :
                // 마이 페이지 화면에 있는 회원가입 버튼
                break;
            case R.id.noSignUp_btn :
                // 마이 페이지 화면에 있는 비회원 버튼
                break;
            case R.id.login_btn :
                // 마이 페이지 화면에 있는 로그인 버튼을 누른 다음 화면의 로그인 버튼
                break;
            case R.id.search :
                // 메인 틀 화면에 있는 검색 이미지 버튼
                break;
            case R.id.shoppingCart :
                // 메인 틀 화면에 있는 장바구니 버튼
                break;
            default:
                break;

        }
    }
}
