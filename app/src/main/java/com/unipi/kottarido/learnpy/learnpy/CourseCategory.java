package com.unipi.kottarido.learnpy.learnpy;

import java.util.List;

public class CourseCategory {

    private String categoryName;
    private String categoryIconURL;
    private List<Courses> categoryCourses;
    private boolean isChecked;

    // constructor gia firebase
    public CourseCategory(){
    }

    public CourseCategory(String categoryName, String categoryIconURL, List<Courses> categoryCourses) {
        this.categoryName = categoryName;
        this.categoryIconURL = categoryIconURL;
        this.categoryCourses = categoryCourses;
        this.isChecked = false;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryIconURL() {
        return categoryIconURL;
    }

    public void setCategoryIconURL(String categoryIconURL) {
        this.categoryIconURL = categoryIconURL;
    }

    public List<Courses> getCategoryCourses() {
        return categoryCourses;
    }

    public void setCategoryCourses(List<Courses> categoryCourses) {
        this.categoryCourses = categoryCourses;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
