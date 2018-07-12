package com.example.tourjapan;

import java.util.HashMap;

public class History {

    /**
     * Private member variables to hold history event
     * title and the date of the event
     */
    private String mEventTitle, mEventDate;

    /**
     * Create a new History object storing the event name, event date, and icon resource id
     * @param eventTitle
     * @param eventDate
     */
    public History(String eventTitle, String eventDate) {

        mEventTitle = eventTitle;
        mEventDate = eventDate;

    }

    public String getEventTitle() {
        return mEventTitle;
    }

    public String getEventDate() {
        return mEventDate;
    }

}
