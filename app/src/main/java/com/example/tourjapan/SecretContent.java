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
                SecretContent.put("G Cans Project", "The G Cans Project, or the Metropolitan Area Outer Underground Discharge Channel, is an underground discharge tunnel that looks like a futuristic secret city under Tokyo. The tunnel was built to discharge excess storm and flood waters from water events. Pillars stand throughout the tunnel over 25 meters in height and the facility was designed to withstand a 200-year storm.");
                SecretContent.put("Ueno and Hachiko Monument", "This heart-warming statue is located in Hongo, Bunkyo, Tokyo and is a statue of Ueno and his faithful dog, Hachiko. The story goes, Ueno would go to work every day from Shibuya station and on his return, Hachiko would be waiting for him to greet his master. Following Ueno's death, it is said Hachiko would continue to wait for him every day at the station for 9 years until his own passing.");
                SecretContent.put("Rikugien Gardens", "These gardens are some of the most beautiful in Tokyo and are consistently beautiful all year. The gardens are a sight to behold and walking the garden and enjoying its beauty takes about an hour to do. Built in 1700, the garden is a great historic window to the Edo Period.");
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
