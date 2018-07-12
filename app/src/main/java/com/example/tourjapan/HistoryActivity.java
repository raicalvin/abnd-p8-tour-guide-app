package com.example.tourjapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView myTV = (TextView) findViewById(R.id.history_layout_text_content);
        TextView myTV2 = (TextView) findViewById(R.id.history_layout_history_date);

        Intent receivedIntent = new Intent(getIntent());

        String receivingActivityName = receivedIntent.getStringExtra("receivingFragmentName");

        myTV.setText(receivedIntent.getStringExtra("Event-Description"));
        myTV2.setText(receivedIntent.getStringExtra("Event-Date"));

    }
}
