package com.example.tourjapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecretsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secrets);

        Intent receivedIntent = new Intent(getIntent());

        TextView secretTitle = findViewById(R.id.secrets_layout_title);
        TextView secretLocation = findViewById(R.id.secrets_layout_general_location);
        TextView secretDescription = findViewById(R.id.secrets_layout_description);

        secretTitle.setText(receivedIntent.getStringExtra("Secret-Title"));
        secretDescription.setText(receivedIntent.getStringExtra("Secret-Description"));
        secretLocation.setText(receivedIntent.getStringExtra("Secret-Location"));

    }
}
