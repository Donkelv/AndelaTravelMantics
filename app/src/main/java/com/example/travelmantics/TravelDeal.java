package com.example.travelmantics;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private  String id;
    private  String title;
    private  String description;
    private  String Price;
    private  String Imageurl;

    public TravelDeal (){

    }

    public TravelDeal( String title, String description, String price, String imageurl) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        setPrice(price);
        setImageurl(imageurl);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getImageurl() {
        return Imageurl;
    }

    public void setImageurl(String imageurl) {
        Imageurl = imageurl;
    }
}
