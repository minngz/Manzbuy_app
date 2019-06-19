package com.example.manzbuy;

public class Market {
    private String marketName;
    private String marketTag1;
    private String marketTag2;
    private boolean market_bookmark;
    private String imageUrl1;
    private String imageUrl2;
    private String imageUrl3;

    public Market(String marketName, String marketTag1, String marketTag2, boolean market_bookmark, String imageUrl1, String imageUrl2, String imageUrl3) {
        this.marketName = marketName;
        this.marketTag1 = marketTag1;
        this.marketTag2 = marketTag2;
        this.market_bookmark = market_bookmark;
        this.imageUrl1 = imageUrl1;
        this.imageUrl2 = imageUrl2;
        this.imageUrl3 = imageUrl3;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketTag1() {
        return marketTag1;
    }

    public void setMarketTag1(String marketTag1) {
        this.marketTag1 = marketTag1;
    }

    public String getMarketTag2() {
        return marketTag2;
    }

    public void setMarketTag2(String marketTag2) {
        this.marketTag2 = marketTag2;
    }

    public boolean isMarket_bookmark() {
        return market_bookmark;
    }

    public void setMarket_bookmark(boolean market_bookmark) {
        this.market_bookmark = market_bookmark;
    }

    public String getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public String getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(String imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }
}
