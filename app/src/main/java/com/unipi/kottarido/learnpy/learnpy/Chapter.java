package com.unipi.kottarido.learnpy.learnpy;

import java.util.List;

public class Chapter {

    // tuple pou dixnei se poio course category kai poio level antistixei auto to chapter
    private int chapterID;
    private Tuple chapterInfo;  //dil anikei sto x course category kai y epipedo

    //chapter type1
    private String explanation;
    private String codeUrl;
    private boolean isMultipleChoice;
    private multipleChoiceChapter chapterType1;

    // chapter type2
    private SelectTheCodeChapter chapterType2;
    private String codeToBeReturned ;

    // prepei na iparxei enas telios adios constructor gia tin firebase
    public Chapter(){

    }

    public Chapter(int chapterID, Tuple chapterInfo, String explanation, String codeUrl, boolean isMultipleChoice, List<String> answers, String corectAnswer) {
        this.chapterID = chapterID;
        this.chapterInfo = chapterInfo;
        this.explanation = explanation;
        this.codeUrl = codeUrl;
        this.isMultipleChoice = isMultipleChoice;

        if (isMultipleChoice) {
            chapterType1 = new multipleChoiceChapter(answers, corectAnswer);
            chapterType2 = null;
        }
    }

    public Chapter(int chapterID, Tuple chapterInfo, String explanation, boolean isMultipleChoice, String codeToBeReturned, List<String> answersUrls, String corectAnswerUrl, String correctAnswer) {
        this.chapterID = chapterID;
        this.chapterInfo = chapterInfo;
        this.explanation = explanation;
        this.isMultipleChoice = isMultipleChoice;
        this.codeToBeReturned = codeToBeReturned;

         if(!isMultipleChoice) {
             chapterType1 = null;
            chapterType2 = new SelectTheCodeChapter(answersUrls,corectAnswerUrl,correctAnswer);
        }
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    public void setMultipleChoice(boolean multipleChoice) {
        isMultipleChoice = multipleChoice;
    }

    public multipleChoiceChapter getChapterType1() {
        return chapterType1;
    }

    public void setChapterType1(multipleChoiceChapter chapterType1) {
        this.chapterType1 = chapterType1;
    }

    public SelectTheCodeChapter getChapterType2() {
        return chapterType2;
    }

    public void setChapterType2(SelectTheCodeChapter chapterType2) {
        this.chapterType2 = chapterType2;
    }

    public String getCodeToBeReturned() {
        return codeToBeReturned;
    }

    public void setCodeToBeReturned(String codeToBeReturned) {
        this.codeToBeReturned = codeToBeReturned;
    }

    public int getChapterID() {
        return chapterID;
    }

    public void setChapterID(int chapterID) {
        this.chapterID = chapterID;
    }

    public Tuple getChapterInfo() {
        return chapterInfo;
    }

    public void setChapterInfo(Tuple chapterInfo) {
        this.chapterInfo = chapterInfo;
    }
}
