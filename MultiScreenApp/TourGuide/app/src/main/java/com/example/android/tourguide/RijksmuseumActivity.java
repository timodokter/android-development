package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class RijksmuseumActivity extends AppCompatActivity {

    String textInfoRijksmuseum;
    String textTitleRijksmuseum;
    int idImageRijksmuseum = R.drawable.rijksmuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        textInfoRijksmuseum = getString(R.string.info_rijksmuseum);
        textTitleRijksmuseum = getString(R.string.title_rijksmuseum);

        Attractions currentCategory = new Attractions(textInfoRijksmuseum, textTitleRijksmuseum, idImageRijksmuseum);
    }
}