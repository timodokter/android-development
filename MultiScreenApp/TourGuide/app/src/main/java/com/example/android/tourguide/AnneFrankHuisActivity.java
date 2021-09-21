package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AnneFrankHuisActivity extends AppCompatActivity {

    String textInfoAnneFrankHuis;
    String textTitleAnneFrankHuis;
    int idImageAnneFrankHuis = R.drawable.annefrankhuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        textInfoAnneFrankHuis = getString(R.string.info_anne_frank_huis);
        textTitleAnneFrankHuis = getString(R.string.title_anne_frank_huis);

        Attractions currentCategory = new Attractions(textInfoAnneFrankHuis, textTitleAnneFrankHuis, idImageAnneFrankHuis);
    }
}