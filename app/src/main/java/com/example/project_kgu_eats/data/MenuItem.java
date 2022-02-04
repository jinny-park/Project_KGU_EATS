package com.example.project_kgu_eats.data;

public class MenuItem {

    String menuName;
    String price;

    public MenuItem(String menuName, String price) {
        this.menuName = menuName;
        this.price = price;
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
