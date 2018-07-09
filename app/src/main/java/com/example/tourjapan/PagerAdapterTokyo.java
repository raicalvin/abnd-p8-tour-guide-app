package com.example.tourjapan;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapterTokyo extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public PagerAdapterTokyo(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_history);
            case 1:
                return mContext.getString(R.string.tab_places);
            case 2:
                return mContext.getString(R.string.tab_food);
            case 3:
                return mContext.getString(R.string.tab_secrets);
            default:
                return null;
        }
    }
}
