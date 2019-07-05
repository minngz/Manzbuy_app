package com.example.manzbuy;

public class DetailAskItem {
    private String date;
    private String id;
    private String contents;
    private String answer;

    public DetailAskItem(String date, String id, String contents, String answer) {
        this.date = date;
        this.id = id;
        this.contents = contents;
        this.answer = answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
