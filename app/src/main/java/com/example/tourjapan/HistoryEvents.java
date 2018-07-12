package com.example.tourjapan;

import java.util.*;
import java.util.Map;

public class HistoryEvents {

    // Creation of HashMap
    private HashMap<String, String> HistoryEvents = new HashMap<>();

    /**
     *
     * @param city name tokyo or kyoto
     */
    public HistoryEvents(String city) {

        switch (city) {
            case "Tokyo":
                HistoryEvents.put("The Great War of Bubbles", "It was a most bubbly day.");
                HistoryEvents.put("Pilo's Problem Probably", "This was what happened in Event 2! Back in my day....");
                HistoryEvents.put("India and Japan", "This was what happened in Event 3! Back in my day....");
                break;
            case "Kyoto":
                HistoryEvents.put("event5", "Event 5 description here...");
                HistoryEvents.put("event6", "Event 6 description here...");
                break;
        }

    }

    public String getValue(String eventTitle) {
        return HistoryEvents.get(eventTitle);
    }

}
