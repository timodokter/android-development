package com.example.android.report_card;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView grades = findViewById(R.id.grades);
        ReportCard();
        grades.setText(toString());
    }

    double mathGrade, dutchGrade, englishGrade, historyGrade, artGrade, chemistryGrade;
    String reportGrades;
    String name = "Timo";

    //getter and setter for math
    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double grade) {
        mathGrade = grade;
    }

    //getter and setter for math
    public double getDutchGrade() {
        return dutchGrade;
    }

    public void setDutchGrade(double grade) {
        dutchGrade = grade;
    }

    //getter and setter for math
    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double grade) {
        englishGrade = grade;
    }

    //getter and setter for math
    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double grade) {
        historyGrade = grade;
    }

    //getter and setter for math
    public double getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(double grade) {
       artGrade = grade;
    }

    //getter and setter for math
    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double grade) {
        chemistryGrade = grade;
    }

    public void ReportCard() {
        setMathGrade(10);
        setDutchGrade(7.0);
        setEnglishGrade(7.4);
        setHistoryGrade(8.9);
        setArtGrade(5.6);
        setChemistryGrade(8.4);
    }

    @NonNull
    @Override
    public String toString() {
        reportGrades = "Name: " + name;
        reportGrades += "\nMath grade: " + getMathGrade();
        reportGrades += "\nDutch grade: " + getDutchGrade();
        reportGrades += "\nEnglish grade: " + getEnglishGrade();
        reportGrades += "\nHistory grade: " + getHistoryGrade();
        reportGrades += "\nArt grade: " + getArtGrade();
        reportGrades += "\nChemistry grade: " + getChemistryGrade();
        return reportGrades;
    }
}