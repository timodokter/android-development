package com.example.android.onderwijsquiz_userinputproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
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

}