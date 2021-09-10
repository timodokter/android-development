package com.example.android.onderwijsquiz_userinputproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*vraag 1*/
    String givenAnswerQ1;
    String goodAnswerQ1;
    boolean isAnswerQ1Correct = false;

    public boolean CheckQ1() {
        goodAnswerQ1 = "1945";
        EditText antwoord1 = findViewById(R.id.vraag1_antwoord);
        givenAnswerQ1 = antwoord1.getText().toString().toLowerCase(Locale.ROOT);

        isAnswerQ1Correct = givenAnswerQ1.equals(goodAnswerQ1);
        return isAnswerQ1Correct;
    }

    /*vraag 2*/
    String givenAnswerQ2;
    String goodAnswerQ2;
    Boolean isAnswerQ2Correct = false;

    public boolean CheckQ2() {
        goodAnswerQ2 = "air force one";
        EditText antwoord2 = findViewById(R.id.vraag2_antwoord);
        givenAnswerQ2 = antwoord2.getText().toString().toLowerCase(Locale.ROOT);

        isAnswerQ2Correct = givenAnswerQ2.equals(goodAnswerQ2);
        return isAnswerQ2Correct;
    }

    /*vraag 3*/
    Boolean isAnswerQ3Correct = false;
    int goodIdQ3;
    int givenAnswerQ3;

    public boolean CheckQ3() {
        RadioGroup vraag3_antwoorden = findViewById(R.id.vraag3_antwoorden);
        givenAnswerQ3 = vraag3_antwoorden.getCheckedRadioButtonId();
        RadioButton goodAnswerQ3 = findViewById(R.id.vraag3_antwoord3);
        goodIdQ3 = goodAnswerQ3.getId();

        isAnswerQ3Correct = givenAnswerQ3 == goodIdQ3;
        return isAnswerQ3Correct;
    }

    /*vraag 4*/
    Boolean isAnswerQ4Correct = false;
    int goodIdQ4;
    int givenAnswerQ4;

    public boolean CheckQ4() {
        RadioGroup vraag4_antwoorden = findViewById(R.id.vraag4_antwoorden);
        givenAnswerQ4 = vraag4_antwoorden.getCheckedRadioButtonId();
        RadioButton goodAnswerQ4 = findViewById(R.id.vraag4_antwoord3);
        goodIdQ4 = goodAnswerQ4.getId();

        isAnswerQ4Correct = givenAnswerQ4 == goodIdQ4;
        return isAnswerQ4Correct;
    }



    public void submitAnswers(View view) {
        CheckQ1();
        CheckQ2();
        CheckQ3();
        CheckQ4();

    }
}