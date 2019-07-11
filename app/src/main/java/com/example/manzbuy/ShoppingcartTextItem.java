package com.example.manzbuy;

public class ShoppingcartTextItem {
    private String contents;
    private String sum;
    private String text;

    public ShoppingcartTextItem(String sum) {
        this.sum = sum;
    }

    public ShoppingcartTextItem(String contents, String sum, String text) {
        this.contents = contents;
        this.sum = sum;
        this.text = text;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
