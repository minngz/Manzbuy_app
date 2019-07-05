package com.example.manzbuy;

public class DetailMarketItemArray {
    private String imageUrl;
    private String itemName;
    private String itemPrice;
    private boolean itemBookmark;

    public DetailMarketItemArray(String imageUrl, String itemName, String itemPrice, boolean itemBookmark) {
        this.imageUrl = imageUrl;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemBookmark = itemBookmark;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public boolean isItemBookmark() {
        return itemBookmark;
    }

    public void setItemBookmark(boolean itemBookmark) {
        this.itemBookmark = itemBookmark;
    }
}
