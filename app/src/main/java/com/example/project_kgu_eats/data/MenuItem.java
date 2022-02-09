package com.example.project_kgu_eats.data;

public class MenuItem {

    String menuName;
    String price;
    public int image;


    public MenuItem(String menuName, String price, int image) {
        this.menuName = menuName;
        this.price = price;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
