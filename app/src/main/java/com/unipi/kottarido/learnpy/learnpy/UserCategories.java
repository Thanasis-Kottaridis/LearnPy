package com.unipi.kottarido.learnpy.learnpy;

public class UserCategories {
    private int Image;
    private String Title;
    private String Description;
    private boolean Selected;

    //no argument constructor!!! einai aparetitos gia na fortothei obj apo tin firebase
    //prepei na exw dilomeno enan no-argument constructor gia na xristimopoiithei
    //otan tou anathetoume to value enos snapshot obj tis firebase
    public UserCategories(){

    }

    public UserCategories(int image, String title, String description, boolean selected) {
        Image = image;
        Title = title;
        Description = description;
        Selected = selected;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isSelected() {
        return Selected;
    }

    public void setSelected(boolean selected) {
        Selected = selected;
    }
}
