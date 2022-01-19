package com.example.project_kgu_eats;

public class ResItem {
    String name;
    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ResItem(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public ResItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
