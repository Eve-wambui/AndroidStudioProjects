package com.example.hp.tabbedactivity;

public class Here {
    //we will refer to the images based on the id
    int image;
    String name,team;

    public Here(int image, String name, String team) {
        this.image = image;
        this.name = name;
        this.team = team;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}
