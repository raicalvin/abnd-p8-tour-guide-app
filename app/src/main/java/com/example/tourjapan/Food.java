package com.example.tourjapan;

public class Food {
    /**
     * Private member variables to hold tourist location
     */
    private String mFoodTitle, mFoodDescription;
    private int mPicResourceID, mHeaderResourceID;

    /**
     * Create a new Food object storing the food title and icon resource id
     * @param foodTitle
     * @param picResource
     */
    public Food(String foodTitle, int picResource, int headerResource, String foodDescription) {
        mFoodTitle = foodTitle;
        mPicResourceID = picResource;
        mHeaderResourceID = headerResource;
        mFoodDescription = foodDescription;
    }

    public String getFoodTitle() {
        return mFoodTitle;
    }

    public int getPicResourceID() {
        return mPicResourceID;
    }

    public int getHeaderResourceID() { return mHeaderResourceID; }

    public String getFoodDescription() { return mFoodDescription; }
}
