package com.example.tourjapan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapterTokyo extends FragmentPagerAdapter {

    public PagerAdapterTokyo(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentTokyoHistory();
            case 1:
                return new FragmentTokyoPlaces();
            case 2:
                return new FragmentTokyoFood();
            case 3:
                return new FragmentTokyoSecrets();
            default:
                return null;
        }
    }

}
