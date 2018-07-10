package com.example.tourjapan;

public class Food {
    /**
     * Private member variables to hold tourist location
     */
    private String mFoodTitle;
    private int mPicResourceID;

    /**
     * Create a new Food object storing the food title and icon resource id
     * @param foodTitle
     * @param picResource
     */
    public Food(String foodTitle, int picResource) {
        mFoodTitle = foodTitle;
        mPicResourceID = picResource;
    }

    public String getFoodTitle() {
        return mFoodTitle;
    }

    public int getPicResourceID() {
        return mPicResourceID;
    }
}
