package com.example.manzbuy;

public class BookmarkItem {
    private String itemImageUrl;
    private String itemMarketImageUrl;
    private String marketName;
    private String itemName;
    private String itemPrice;
    private boolean itemBookmark;

    public BookmarkItem(String itemImageUrl, String itemMarketImageUrl, String marketName, String itemName, String itemPrice, boolean itemBookmark) {
        this.itemImageUrl = itemImageUrl;
        this.itemMarketImageUrl = itemMarketImageUrl;
        this.marketName = marketName;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemBookmark = itemBookmark;
    }

    public String getItemImageUrl() {
        return itemImageUrl;
    }

    public void setItemImageUrl(String itemImageUrl) {
        this.itemImageUrl = itemImageUrl;
    }

    public String getItemMarketImageUrl() {
        return itemMarketImageUrl;
    }

    public void setItemMarketImageUrl(String itemMarketImageUrl) {
        this.itemMarketImageUrl = itemMarketImageUrl;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
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
