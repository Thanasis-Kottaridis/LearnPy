package com.unipi.kottarido.learnpy.learnpy;

import java.util.List;

public class Courses {

    // cours info
    private String CourseCategory;
    private int Level;

    private String Title;
    private int Thumbnail;
    private List<Chapter> chapters;

    // prepei na iparxei enas telios adios constructor gia tin firebase
    public Courses(){

    }

    public Courses(String courseCategory,int level,String title, int thumbnail, List<Chapter> chapters) {
        CourseCategory = courseCategory;
        Level = level;
        Title = title;
        Thumbnail = thumbnail;
        this.chapters = chapters;
    }

    public Courses(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getCourseCategory() {
        return CourseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        CourseCategory = courseCategory;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

}
