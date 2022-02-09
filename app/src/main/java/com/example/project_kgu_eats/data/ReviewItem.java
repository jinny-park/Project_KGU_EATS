package com.example.project_kgu_eats.data;

public class ReviewItem {

    String userName;
    String comment;
    public int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ReviewItem(String userName, String comment, int image) {
        this.userName = userName;
        this.comment = comment;
        this.image = image;
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
