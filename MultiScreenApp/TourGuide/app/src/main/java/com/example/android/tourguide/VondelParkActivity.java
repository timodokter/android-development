package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VondelParkActivity extends AppCompatActivity {

    String textInfoVondelPark;
    String textTitleVondelPark;
    int idImageVondelPark = R.drawable.vondelpark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        textInfoVondelPark = getString(R.string.info_vondelpark);
        textTitleVondelPark = getString(R.string.title_vondelpark);

        Attractions currentCategory = new Attractions(textInfoVondelPark, textTitleVondelPark, idImageVondelPark);

        AttractionsAdapter adapter = new AttractionsAdapter(this);
    }
}