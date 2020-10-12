package com.oneg.android_lab3_bai2;

public class Cable {
    private String Name;
    private int Image;
    private String Price;
    private String Discount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public Cable(String name, int image, String price, String discount) {
        Name = name;
        Image = image;
        Price = price;
        Discount = discount;
    }


}
