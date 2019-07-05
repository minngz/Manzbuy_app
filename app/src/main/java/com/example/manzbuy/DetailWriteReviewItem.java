package com.example.manzbuy;

public class DetailWriteReviewItem {
    private String date;
    private String id;
    private String color;
    private String size;
    private String contents;
    private int rating;

    public DetailWriteReviewItem(String date, String id, String color, String size, String contents, int rating) {
        this.date = date;
        this.id = id;
        this.color = color;
        this.size = size;
        this.contents = contents;
        this.rating = rating;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
