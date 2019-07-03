package com.example.manzbuy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MypageFragment extends Fragment {
    private ArrayList<MypageSection> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mypage_frame_fragment, container, false);

        data = new ArrayList<MypageSection>();

        createData();
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.mypage_recyclerView);
       // recyclerView.setHasFixedSize(true);
        MypageRecyclerViewAdapter adapter = new MypageRecyclerViewAdapter(data, this.getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void createData(){
        MypageSection dm = new MypageSection();

        dm.setSectionTitle("쇼핑 활동");
        ArrayList<MypageContentsModel> item = new ArrayList<MypageContentsModel>();
        item.add(new MypageContentsModel("주문 내역"));
        item.add(new MypageContentsModel("취소/반품 내역"));
        item.add(new MypageContentsModel("최근 본 상품"));
        item.add(new MypageContentsModel("상품 문의"));
        item.add(new MypageContentsModel("1:1 문의"));
        item.add(new MypageContentsModel("상품 후기"));

        dm.setData(item);
        data.add(dm);

        MypageSection ms = new MypageSection();

        ms.setSectionTitle("계정 관리");
        ArrayList<MypageContentsModel> item2 = new ArrayList<MypageContentsModel>();

        item2.add(new MypageContentsModel("회원정보 수정"));
        item2.add(new MypageContentsModel("설정"));
        item2.add(new MypageContentsModel("서비스 이용약관"));
        item2.add(new MypageContentsModel("개인정보 수집 및 이용"));

        ms.setData(item2);
        data.add(ms);

    }
}
