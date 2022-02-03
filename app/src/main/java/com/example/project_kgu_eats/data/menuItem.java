package com.example.project_kgu_eats.data;

public class menuItem {

    String menuName;
    int price;

    public menuItem(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
