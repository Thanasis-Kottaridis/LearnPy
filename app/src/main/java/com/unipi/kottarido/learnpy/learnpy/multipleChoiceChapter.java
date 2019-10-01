package com.unipi.kottarido.learnpy.learnpy;

import java.util.List;

public class multipleChoiceChapter {

    private List<String> answers;
    private String corectAnswer;

    // prepei na iparxei enas telios adios constructor gia tin firebase
    public multipleChoiceChapter(){

    }

    public multipleChoiceChapter( List<String> answers, String corectAnswer) {
        this.answers = answers;
        this.corectAnswer = corectAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getCorectAnswer() {
        return corectAnswer;
    }

    public void setCorectAnswer(String corectAnswer) {
        this.corectAnswer = corectAnswer;
    }
}
