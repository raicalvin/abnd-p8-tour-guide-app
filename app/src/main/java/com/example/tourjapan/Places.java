package com.example.tourjapan;

public class Places {

    /**
     * Private member variables to hold tourist location
     */
    private String mPlaceTitle;
    private int mPicResourceID;
    private String mPlaceDescription;
    private int mHeaderResourceID;

    /**
     * Create a new Places object storing the location name and the resource ID
     * @param placeTitle
     * @param picResource
     * @param placeDescription
     * @param headerResource
     */
    public Places(String placeTitle, int picResource, String placeDescription, int headerResource) {
        mPlaceTitle = placeTitle;
        mPicResourceID = picResource;
        mPlaceDescription = placeDescription;
        mHeaderResourceID = headerResource;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public int getPicResourceID() {
        return mPicResourceID;
    }

    public String getPlaceDescription() { return mPlaceDescription; }

    public int getHeaderResourceID() { return mHeaderResourceID; }

}
