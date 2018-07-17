package com.example.tourjapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        Intent incoming = new Intent(getIntent());

        TextView placeTV = findViewById(R.id.places_layout_location);
        TextView descTV = findViewById(R.id.places_layout_description);
        ImageView bgImg = findViewById(R.id.places_layout_background_image);

        descTV.setText(incoming.getStringExtra("Place-Description"));
        bgImg.setImageResource(incoming.getIntExtra("Place-Image", 0));
        placeTV.setText(incoming.getStringExtra("Place-Title"));

    }
}
