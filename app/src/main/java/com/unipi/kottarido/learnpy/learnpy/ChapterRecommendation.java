package com.unipi.kottarido.learnpy.learnpy;

public class ChapterRecommendation {
    String category;
    String courseID;
    String chapterID;
    float averageScore;


    public ChapterRecommendation(String category, String courseID, String chapterID, float averageScore) {
        this.category = category;
        this.courseID = courseID;
        this.chapterID = chapterID;
        this.averageScore = averageScore;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getChapterID() {
        return chapterID;
    }

    public void setChapterID(String chapterID) {
        this.chapterID = chapterID;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}
