package com.example.hp.customlistview;

public class Here {
    //we will refer to the images based on the id
    int image;
    String name,team;
//constructor to initialize values
    //it fetches the images,names and teams
    public Here(int image, String name, String team) {
        this.image = image;
        this.name = name;
        this.team = team;
    }
//once it gets the values you want it to display
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
