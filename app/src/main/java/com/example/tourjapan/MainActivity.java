package com.example.tourjapan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mainMenuNagoya = (RelativeLayout) findViewById(R.id.main_menu_nagoya);
        RelativeLayout mainMenuNakatsugawa = (RelativeLayout) findViewById(R.id.main_menu_nakatsugawa);
        RelativeLayout mainMenuTokyo = (RelativeLayout) findViewById(R.id.main_menu_tokyo);
        RelativeLayout mainMenuKyoto = (RelativeLayout) findViewById(R.id.main_menu_kyoto);
        RelativeLayout mainMenuOsaka = (RelativeLayout) findViewById(R.id.main_menu_osaka);

        mainMenuNagoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nagoya Activity Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mainMenuNakatsugawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nakatsugawa Activity Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mainMenuTokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Tokyo Activity Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mainMenuKyoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kyoto Activity Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mainMenuOsaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Osaka Activity Clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
