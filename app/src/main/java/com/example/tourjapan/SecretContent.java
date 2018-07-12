package com.example.tourjapan;

import java.util.HashMap;

public class SecretContent {

    // Creation of HashMap
    private HashMap<String, String> SecretContent = new HashMap<>();

    /**
     *
     * @param city name tokyo or kyoto
     */
    public SecretContent(String city) {

        switch (city) {
            case "Tokyo":
                SecretContent.put("Secret1", "Secret 1 contains some secret");
                SecretContent.put("Secret2", "Secret 2 contains some other secret");
                SecretContent.put("Secret3", "Secret 3 contains a super important secret");
                SecretContent.put("Secret4", "Secret 4 yeah");
                break;
            case "Kyoto":
                SecretContent.put("event5", "Event 5 description here...");
                SecretContent.put("event6", "Event 6 description here...");
                break;
        }

    }

    public String getValue(String secretTitle) {
        return SecretContent.get(secretTitle);
    }


}
