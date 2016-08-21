package com.example.admin.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends Activity {

    int score = 0;
    int answer_two = 0;
    int answer_four = 0;
    int answer_five = 0;
    int ticker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void answerTwo(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.option_1:
                if (checked)
                    answer_two = 0;
                break;
            case R.id.option_2:
                if (checked)
                    answer_two = 0;
                break;
            case R.id.option_3:
                if (checked)
                    answer_two = 0;
                break;
            case R.id.option_4:
                if (checked)
                    answer_two = 1;
                break;
        }
    }

    public void answerFour(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q4_option_1:
                if (checked)
                    answer_four = 0;
                break;
            case R.id.q4_option_2:
                if (checked)
                    answer_four = 0;
                break;
            case R.id.q4_option_3:
                if (checked)
                    answer_four = 0;
                break;
            case R.id.q4_option_4:
                if (checked)
                    answer_four = 1;
                break;
        }
    }

    public void answerFive(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q5_option_1:
                if (checked)
                    answer_five = 0;
                break;
            case R.id.q5_option_2:
                if (checked)
                    answer_five = 0;
                break;
            case R.id.q5_option_3:
                if (checked)
                    answer_five = 1;
                break;
            case R.id.q5_option_4:
                if (checked)
                    answer_five = 0;
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cboption_1:
                if (checked)
                    ticker++;
                break;
            case R.id.cboption_2:
                if (checked)
                    ticker++;
                break;
            case R.id.cboption_3:
                if (checked)
                    ticker--;
                break;
            case R.id.cboption_4:
                if (checked)
                    ticker--;
                break;
        }
    }

    public void endQuiz(View view) {
        String answer;
        EditText answerOne = (EditText) findViewById(R.id.answer_one);
        answer = answerOne.getText().toString();
        answer = answer.toLowerCase();

        if (answer.equals("vint cerf")|answer.equals("bob kahn")) {
            score += 20;
        } else {
            score += 0;
        }

        if (answer_two >= 1) {
            score += 20;
        } else {
            score += 0;
        }

        if (answer_four >= 1) {
            score += 20;
        } else {
            score += 0;
        }

        if (answer_five >= 1) {
            score += 20;
        } else {
            score += 0;
        }

        if (ticker >= 2) {
            score += 20;
        }
        Toast.makeText(this, "Score : " + score + "/100", Toast.LENGTH_LONG).show();
        score = 0;
    }
}
