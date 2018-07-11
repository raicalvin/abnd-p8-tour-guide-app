package com.example.tourjapan;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class MainActivityTokyo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tokyo);

        // Set up the ViewPager to control lists for the tab items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_tokyo);

        // This adapter will know which fragments need to be shown on each page
        PagerAdapterTokyo adapter = new PagerAdapterTokyo(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs for Tokyo
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_tokyo);

        // Connect tab layout with the view pager
        tabLayout.setupWithViewPager(viewPager);

        // TRYING OUT ONITEMCLICK




    }
}
