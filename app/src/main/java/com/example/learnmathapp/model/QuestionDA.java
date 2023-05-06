package com.example.learnmathapp.model;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class QuestionDA {
    private ArrayList<Question> questions = new ArrayList<>();
    public QuestionDA(){
        questions.add(new Question(2,"What is the value of 5 raised to the power of 3?","125"));
        questions.add(new Question(2,"What is the value of π (pi) rounded to two decimal places?","3.14"));
        questions.add(new Question(2,"What is the quotient of 15 ÷ 3?","5"));
        questions.add(new Question(2,"What is the product of 9 and 7?","63"));
        questions.add(new Question(2,"What is the square root of 64?","8"));
        questions.add(new Question(2,"What is the result of 7 - 3?","4"));
    }

//    public void getQuestion(View view){
//        QuestionDA objQ = new QuestionDA();
//        List<Question> questions = objQ.getQuestion("");
//    }
}
