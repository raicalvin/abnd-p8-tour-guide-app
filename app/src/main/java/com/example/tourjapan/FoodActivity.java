package com.example.tourjapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Intent incoming = new Intent(getIntent());

        TextView myTV = findViewById(R.id.food_layout_title );
        ImageView myImg = findViewById(R.id.food_layout_background_image);
        TextView descTV = findViewById(R.id.food_layout_description);

        myTV.setText(incoming.getStringExtra("Food-Title"));
        myImg.setImageResource(incoming.getIntExtra("Food-Image", 0));
        descTV.setText(incoming.getStringExtra("Food-Description"));

    }
}
