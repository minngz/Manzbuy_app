package com.example.manzbuy;

public class BookmarkMarket {
    private String MarketImgUrl;
    private String MarketName;
    private String MarketTagName1;
    private String MarketTagName2;
    private boolean MarketBookmark;

    public BookmarkMarket(String marketImgUrl, String marketName, String marketTagName1, String marketTagName2, boolean marketBookmark) {
        MarketImgUrl = marketImgUrl;
        MarketName = marketName;
        MarketTagName1 = marketTagName1;
        MarketTagName2 = marketTagName2;
        MarketBookmark = marketBookmark;
    }

    public String getMarketImgUrl() {
        return MarketImgUrl;
    }

    public void setMarketImgUrl(String marketImgUrl) {
        MarketImgUrl = marketImgUrl;
    }

    public String getMarketName() {
        return MarketName;
    }

    public void setMarketName(String marketName) {
        MarketName = marketName;
    }

    public String getMarketTagName1() {
        return MarketTagName1;
    }

    public void setMarketTagName1(String marketTagName1) {
        MarketTagName1 = marketTagName1;
    }

    public String getMarketTagName2() {
        return MarketTagName2;
    }

    public void setMarketTagName2(String marketTagName2) {
        MarketTagName2 = marketTagName2;
    }

    public boolean isMarketBookmark() {
        return MarketBookmark;
    }

    public void setMarketBookmark(boolean marketBookmark) {
        MarketBookmark = marketBookmark;
    }
}
