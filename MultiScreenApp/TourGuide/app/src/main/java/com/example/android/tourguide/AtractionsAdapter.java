package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class AtractionsAdapter extends ArrayAdapter<Atractions> {

    public AtractionsAdapter(Activity context, ArrayList<Atractions> atractions) {
        super(context, 0 , atractions);
    }
}
