package com.example.tourjapan;

public class Places {

    /**
     * Private member variables to hold tourist location
     */
    private String mPlaceTitle;
    private int mPicResourceID;

    /**
     * Create a new Places object storing the location name and the resource ID
     * @param placeTitle
     * @param picResource
     */
    public Places(String placeTitle, int picResource) {
        mPlaceTitle = placeTitle;
        mPicResourceID = picResource;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public int getPicResourceID() {
        return mPicResourceID;
    }

}
