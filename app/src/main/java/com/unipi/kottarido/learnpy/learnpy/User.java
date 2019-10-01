package com.unipi.kottarido.learnpy.learnpy;

import android.net.Uri;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private UserCategories userType;
    private Uri profileImg;
    private int profileScore;

    // List me ta user Preferences
    private List<CourseCategory> userPreferences;

    // user level ana course category
    private List<Tuple> userLevels;

    //listes pou periexoun tis courses kai ta daily quests
    // pou exei o 3ekinisei kai oloklirosei o user
    private List<PractiseTests> PractiseTestInProgresses;
    private List<PractiseTests> PractiseTestSolved;
    private List<Courses> coursesInProgress;
    private List<Courses> coursesCompleted;

    // comments
    private List<Comment> userComments;


    //no argument constructor!!! einai aparetitos gia na fortothei obj apo tin firebase
    //prepei na exw dilomeno enan no-argument constructor gia na xristimopoiithei
    //otan tou anathetoume to value enos snapshot obj tis firebase
    public User() {

    }

    //constructor pou kalite otan ginete signUp
    public User(String email) {
        this.email = email;
        userType = null;
        userPreferences = null;
        userLevels = null;
        profileScore = 0;
        newUser();
    }

    //constructor pou kalite otan ginete signIn
    public User(String email, UserCategories userType) {

        this.email = email;
        this.userType = userType;
    }

    // methodos pou kalite an o xristis einai neos
    public void newUser() {
        PractiseTestInProgresses = new ArrayList<>();
        PractiseTestSolved = new ArrayList<>();
        coursesInProgress = new ArrayList<>();
        coursesCompleted = new ArrayList<>();
        userComments = new ArrayList<>();
    }

    // methodos pou elenxei an o user einai neos
    public void initialiseUser() {

        if (PractiseTestInProgresses == null)
            PractiseTestInProgresses = new ArrayList<>();
        if (PractiseTestSolved == null)
            PractiseTestSolved = new ArrayList<>();
        if (coursesInProgress == null)
            coursesInProgress = new ArrayList<>();
        if (coursesCompleted == null)
            coursesCompleted = new ArrayList<>();

    }

    //methodoi gia to 3ekinima Daily quest kai course
    public void startPracticeTest(PractiseTests quest) {
        PractiseTestInProgresses.add(quest);
    }

    public void startCources(Courses course) {
        coursesInProgress.add(course);
    }

    // metodoi gia tin oloklirosi kai tin sinexia
    // ton daily quest kai ton courses
    public void completePracticeTest(PractiseTests test, int score) {
        PractiseTestSolved.add(test);
        setProfileScore(score);
    }

    public void completeCourse(Courses course, int score) {
        coursesCompleted.add(course);
        setProfileScore(score);
    }

    //new comment
    public void newComment(Comment comment) {
        userComments.add(comment);
    }

    // GETTERS AND SETTERS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserCategories getUserType() {
        return userType;
    }

    public void setUserType(UserCategories userType) {
        this.userType = userType;
    }

    public List<PractiseTests> getPractiseTestInProgresses() {
        return PractiseTestInProgresses;
    }

    public void setPractiseTestInProgresses(List<PractiseTests> practiseTestInProgresses) {
        this.PractiseTestInProgresses = practiseTestInProgresses;
    }

    public List<PractiseTests> getPractiseTestSolved() {
        return PractiseTestSolved;
    }

    public void setPractiseTestSolved(List<PractiseTests> practiseTestSolved) {
        this.PractiseTestSolved = practiseTestSolved;
    }

    public List<Courses> getCoursesInProgress() {
        return coursesInProgress;
    }

    public void setCoursesInProgress(List<Courses> coursesInProgress) {
        this.coursesInProgress = coursesInProgress;
    }

    public List<Courses> getCoursesCompleted() {
        return coursesCompleted;
    }

    public void setCoursesCompleted(List<Courses> coursesCompleted) {
        this.coursesCompleted = coursesCompleted;
    }


    public List<Comment> getUserComments() {
        return userComments;
    }

    public void setUserComments(List<Comment> userComments) {
        this.userComments = userComments;
    }


    public int getProfileScore() {
        return profileScore;
    }

    public void setProfileScore(int score) {
        profileScore = profileScore + score;
    }

    public List<CourseCategory> getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(List<CourseCategory> userPreferences) {
        this.userPreferences = userPreferences;
    }

    public List<Tuple> getUserLevels() {
        return userLevels;
    }

    public void setUserLevels(List<Tuple> userLevels) {
        this.userLevels = userLevels;
    }
}
