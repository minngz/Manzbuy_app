package com.example.manzbuy;

import android.widget.ImageView;

public class ShoppingcartItem {
    private boolean checking;
    private String itemImage;
    private String itemName;
    private String marketName;
    private String itemPrice;
    private String itemColor;
    private String itemSize;
    private int itemNum;

    public ShoppingcartItem(boolean checking, String itemImage, String itemName, String marketName, String itemPrice, String itemColor, String itemSize, int itemNum) {
        this.checking = checking;
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.marketName = marketName;
        this.itemPrice = itemPrice;
        this.itemColor = itemColor;
        this.itemSize = itemSize;
        this.itemNum = itemNum;
    }

    public boolean isChecking() {
        return checking;
    }

    public void setChecking(boolean checking) {
        this.checking = checking;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
}
