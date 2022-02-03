package com.example.project_kgu_eats.data;

public class review {

    String userName;
    String comment;

    public review(String userName, String comment) {
        this.userName = userName;
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
