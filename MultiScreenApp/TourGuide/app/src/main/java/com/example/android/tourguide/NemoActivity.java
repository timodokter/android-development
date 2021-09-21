package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NemoActivity extends AppCompatActivity {

    String textInfoNemo;
    String textTitleNemo;
    int idImageNemo = R.drawable.nemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        textInfoNemo = getString(R.string.info_nemo);
        textTitleNemo = getString(R.string.title_nemo);

        Attractions currentCategory = new Attractions(textInfoNemo, textTitleNemo, idImageNemo);
    }
}