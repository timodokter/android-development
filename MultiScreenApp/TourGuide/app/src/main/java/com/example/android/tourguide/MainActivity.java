package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rijksmuseumText = (TextView) findViewById(R.id.rijksmuseum_home_text);
        rijksmuseumText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rijksmuseumIntent = new Intent(MainActivity.this, RijksmuseumActivity.class);

                startActivity(rijksmuseumIntent);
            }
        });

        TextView vondelparkText = (TextView) findViewById(R.id.vondelpark_home_text);
        vondelparkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vondelparkIntent = new Intent(MainActivity.this, VondelParkActivity.class);

                startActivity(vondelparkIntent);
            }
        });

        TextView nemoText = (TextView) findViewById(R.id.nemo_home_text);
        nemoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nemoIntent = new Intent(MainActivity.this, NemoActivity.class);

                startActivity(nemoIntent);
            }
        });

        TextView anneFrankHuisText = (TextView) findViewById(R.id.anne_frank_huis_home_text);
        anneFrankHuisText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anneFrankIntent = new Intent(MainActivity.this, AnneFrankHuisActivity.class);

                startActivity(anneFrankIntent);
            }
        });
    }
}