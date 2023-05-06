package com.example.learnmathapp.model;

public class Question {
    private int score;
    private String questionTxt;
    private String ansTxt;

    public Question(int score, String questionTxt, String ansTxt) {
        this.score = score;
        this.questionTxt = questionTxt;
        this.ansTxt = ansTxt;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestionTxt() {
        return questionTxt;
    }

    public void setQuestionTxt(String questionTxt) {
        this.questionTxt = questionTxt;
    }

    public String getAnsTxt() {
        return ansTxt;
    }

    public void setAnsTxt(String ansTxt) {
        this.ansTxt = ansTxt;
    }
}
