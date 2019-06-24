package com.example.manzbuy;

import java.util.ArrayList;

public class MypageSection {
    private String sectionTitle;
    private ArrayList<MypageContentsModel> data;

    public MypageSection(String sectionTitle, ArrayList<MypageContentsModel> data) {
        this.sectionTitle = sectionTitle;
        this.data = data;
    }

    public MypageSection() {
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public ArrayList<MypageContentsModel> getData() {
        return data;
    }

    public void setData(ArrayList<MypageContentsModel> data) {
        this.data = data;
    }
}
