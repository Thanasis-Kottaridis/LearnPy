package com.unipi.kottarido.learnpy.learnpy;

import java.util.List;

public class PractiseTests {
    private String Title;
    private List<Chapter> chapters;
    private String courseTitle;

    // prepei na iparxei enas telios adios constructor gia tin firebase
    public PractiseTests(){

    }

    public PractiseTests(String title, List<Chapter> chapters, String courseTitle) {
        Title = title;
        this.chapters = chapters;
        this.courseTitle = courseTitle;
    }

    public PractiseTests(String title, List<Chapter> chapters) {
        Title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public String getCourse() {
        return courseTitle;
    }

    public void setCourse(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}

