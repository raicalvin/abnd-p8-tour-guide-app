package com.example.tourjapan;

import android.support.v4.content.ContextCompat;

public class Places {

    /**
     * Private member variables to hold tourist location
     */
    private String mPlaceTitle;
    private int mPicResourceID;
    private String mPlaceDescription;

    /**
     * Create a new Places object storing the location name and the resource ID
     * @param placeTitle
     * @param picResource
     */
    public Places(String placeTitle, int picResource, String placeDescription) {
        mPlaceTitle = placeTitle;
        mPicResourceID = picResource;
        mPlaceDescription = placeDescription;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public int getPicResourceID() {
        return mPicResourceID;
    }

    public String getPlaceDescription() { return mPlaceDescription; }

}
