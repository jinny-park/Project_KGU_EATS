package com.example.project_kgu_eats.data;

public class MyTicket {

    int ticket_img;
    String ticket_name;
    String count;

    public MyTicket(int ticket_img, String ticket_name, String count) {
        this.ticket_img = ticket_img;
        this.ticket_name = ticket_name;
        this.count = count;
    }

    public int getTicket_img() {
        return ticket_img;
    }

    public void setTicket_img(int ticket_img) {
        this.ticket_img = ticket_img;
    }

    public String getTicket_name() {
        return ticket_name;
    }

    public void setTicket_name(String ticket_name) {
        this.ticket_name = ticket_name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
