package com.example.delaroy.heterogenousrecyclerview.pojos;



public class SingleHorizontal {

    private int images;
    private String title;
    private String desc;
    public SingleHorizontal() {

    }

    public SingleHorizontal(int images, String title, String desc, String pubDate) {
        this.images = images;
        this.title = title;
        this.desc = desc;
        this.pubDate = pubDate;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String pubDate;




    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
