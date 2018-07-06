package com.example.tourjapan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivityTokyo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tokyo);

        RelativeLayout mainMenuNagoya = (RelativeLayout) findViewById(R.id.main_menu_nagoya);
        RelativeLayout mainMenuNakatsugawa = (RelativeLayout) findViewById(R.id.main_menu_nakatsugawa);
        RelativeLayout mainMenuTokyo = (RelativeLayout) findViewById(R.id.main_menu_tokyo);
        RelativeLayout mainMenuKyoto = (RelativeLayout) findViewById(R.id.main_menu_kyoto);
        RelativeLayout mainMenuOsaka = (RelativeLayout) findViewById(R.id.main_menu_osaka);


    }
}
