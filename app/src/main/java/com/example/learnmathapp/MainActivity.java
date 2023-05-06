package com.example.learnmathapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private RadioButton ansRadioBtn1;
    private RadioButton ansRadioBtn2;
    private RadioButton ansRadioBtn3;
    private Button nextBtn;
    private int scoreSum;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        ansRadioBtn1 = findViewById(R.id.ansRadioBtn1);
        ansRadioBtn2 = findViewById(R.id.ansRadioBtn2);
        ansRadioBtn3 = findViewById(R.id.ansRadioBtn3);
        nextBtn = findViewById(R.id.nextBtn);
//        setQuestion();
    }

    public void ansRadioBtn1(View view) {
    }

    public void ansRadioBtn2(View view) {
    }

    public void ansRadioBtn3(View view) {
    }

//    private void setQuestion() {
//
//        switch () {
//            case 1:
//                questionTextView.setText(a + " + " + b + " = ?");
//                answer = a + b;
//                break;
//            case 2:
//                questionTextView.setText(a + " - " + b + " = ?");
//                answer = a - b;
//                break;
//            case 3:
//                questionTextView.setText(a + " * " + b + " = ?");
//                answer = a * b;
//                break;
//            case 4:
//                if (b == 0) {
//                    b = random.nextInt(10 * difficulty) + 1;
//                }
//                int dividend = a * b;
//                questionTextView.setText(dividend + " / " + b + " = ?");
//                answer = a;
//                break;
//        }
}