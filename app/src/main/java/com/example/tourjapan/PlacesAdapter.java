package com.example.tourjapan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter {

    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the Places item to use
        Places placeItem = (Places) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView otherTV = (TextView) convertView.findViewById(R.id.history_date_text_view);
        otherTV.setVisibility(View.GONE);

        TextView placeTitleTV = (TextView) convertView.findViewById(R.id.history_title_text_view);
        ImageView placeImageIV = (ImageView) convertView.findViewById(R.id.image_icon);

        placeTitleTV.setText(placeItem.getPlaceTitle());
        placeImageIV.setImageResource(placeItem.getPicResourceID());

        return convertView;
    }
}
