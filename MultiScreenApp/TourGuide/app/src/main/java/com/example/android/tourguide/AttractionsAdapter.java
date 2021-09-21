package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import org.w3c.dom.Attr;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    public AttractionsAdapter(Activity context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attractions category = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (category.hasImage()) {
            imageView.setImageResource(category.getImageResourceID());

            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
