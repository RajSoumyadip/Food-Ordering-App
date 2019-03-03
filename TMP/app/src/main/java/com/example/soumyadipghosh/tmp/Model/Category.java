package com.example.soumyadipghosh.tmp.Model;

/**
 * Created by soumyadipghosh on 19/03/18.
 */

public class Category {
    private String Name;
    private String Image;

    public Category(String image, String name) {
        Image = image;
        Name = name;
    }

    public Category() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}

