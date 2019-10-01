package com.unipi.kottarido.learnpy.learnpy;

import java.util.List;

public class SelectTheCodeChapter {
    private List<String> answerURLs;
    private String correctAnswerURL;
    private String correctAnswer;

    // prepei na iparxei enas telios adios constructor gia tin firebase
    public SelectTheCodeChapter(){

    }

    public SelectTheCodeChapter(List<String> answerURLs, String correctAnswerURL, String correctAnswer) {
        this.answerURLs = answerURLs;
        this.correctAnswerURL = correctAnswerURL;
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswerURLs() { ;
        return answerURLs;
    }

    public void setAnswerURLs(List<String> answerURLs) {
        this.answerURLs =  answerURLs;
    }

    public String getCorrectAnswerURL() {
        return correctAnswerURL;
    }

    public void setCorrectAnswerURL(String corectAnswerURL) {
        this.correctAnswerURL = corectAnswerURL;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
