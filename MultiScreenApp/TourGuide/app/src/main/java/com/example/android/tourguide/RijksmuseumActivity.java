package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class RijksmuseumActivity extends AppCompatActivity {

    String textInfoRijksmuseum = getString(R.string.info_rijksmuseum);
    String textTitleRijksmuseum = getString(R.string.title_rijksmuseum);
    int idImageRijksmuseum = R.drawable.rijksmuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
    }

    public Attractions currentCategory = new Attractions(textInfoRijksmuseum, textTitleRijksmuseum, idImageRijksmuseum);
}