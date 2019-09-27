package com.example.emobilis.listview2;

/**
 * Created by emobilis on 7/10/18.
 */

public class Custom {
    int images;
    String name,description;
//constructor to initialize values
    public Custom(int images, String name, String description) {
        this.images = images;
        this.name = name;
        this.description = description;
    }
//to get all values
    public int getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
