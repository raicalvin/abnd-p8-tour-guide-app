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
                HistoryEvents.put("Sensoji Temple","The Sensoji Temple is the oldest Buddhist temple in Tokyo. The temple was built after two brothers found a statue of Kannon, the Goddess of Mercy, in the Sumida River. The temple was built for Kannon since the statue of Kannon kept returning to the two brothers.");
                HistoryEvents.put("Edo Castle is Built", "Edo Castle today is part of the Tokyo Imperial Palace, located in Chiyoda Tokyo. The castle served as the military capital during the Edo period. The castle was built by Ota Dokan in 1457. The castle later became the Tokyo Imperial Palace after the Meiji Restoration.\n" +
                        "\n" +
                        "When the castle was first completed, it had 38 gates. Various fires throughout the years re-shaped parts of the castle and a fire in May 1873 consumed the original Edo Castle. In World War II, the castle site took great damage in the Bombing of Tokyo that had resulted in over 100,000 civilian deaths and many more critically injured.\n");
                HistoryEvents.put("The Edo Period Begins","The Edo Period in Japan was when Japan was under the rule of the Tokugawa shogunate. The period itself consisted of beliefs in no wars, great popularity of arts and culture, a proper and organized social order, and a time where the economy in Japan grew substantially.\n" +
                        "\n" +
                        "The period was ruled by the Tokugawa family and the family established a “four-class” social order in efforts to organize and balance the country. The military being near the top, under the Shogun, then three main social groups, then peasants, then artisans and craft makers, and finally merchants who did little in terms of development and production of food and goods.\n" +
                        "\n" +
                        "The Edo period was a time where the country was unified and peace brought forth by the Tokugawa family. New technology and transport access made it possible for goods and food to be developed and produced in once remote areas that were highly inaccessible. \n");
                HistoryEvents.put("Takashi Hara is Assassinated","Takashi Hara, the Prime Minister of Japan, was assassinated on November 4, 1921 at Tokyo Station. Hara Takashi was the Prime Minister of japan from 1918 to 1921.");
                HistoryEvents.put("The Great Kanto Earthquake", "On Saturday, September 1, 1923, a 7.9 magnitude earthquake struck, taking the lives of over 100,000 people in the greater Tokyo area, triggering tsunami’s with waves up to 12m in height. Damage to the infrastructure was the greatest the city had ever experienced to date.\n" +
                        "\n" +
                        "Starting in 1960, September 1st has been officially recognized as Disaster Prevention Day, a day to honor those who were killed during the earthquake and a day to remind people how important it is to educate yourself and others how to respond in moments of huge natural disasters.\n");
                HistoryEvents.put("The First Tokyo Metro Line","The Ginza Line, connecting the Ueno and Asakusa stations, became the first Tokyo Metro line in 1927. Extensions to the line were developed thereafter and today, the 14.3km lines runs from Shibuya Station to Asakusa Station. The color code of the line is orange. Currently, there are 19 stations along the line.");
                HistoryEvents.put("Tokyo’s Population Reaches 10 million","Japan experienced a great economic growth in the 1960’s made possible by advancements in technology, new industries, and greater availability and production of household appliances and electronics including televisions, refrigerators, washing machines, and more. This shifted the way people lived in Tokyo and in 1962, the population of Tokyo surpassed 10 million.");
                HistoryEvents.put("1964 Summer Olympics", "From October 10, 1964 to October 24, 1964, Tokyo held the first every Olympic Games to be hosted by an Asian country. Yoshinori Sakai was selected my the committee to be the carrier of the Olympic flame. He was born on August 6, 1945, the same date that the atomic bomb landed on Hiroshima. Sakai ran with the flame to pay respect to the fallen victims of the bomb and to call for peace worldwide.\n" +
                        "\n" +
                        "The Olympic games held in Tokyo were also the first games to be broadcast internationally. Previously, recorded tapes were flown around to other countries to be shown on television.\n");
                HistoryEvents.put("The Rainbow Bridge in Tokyo Bay is Opened","The Rainbow Bridge finishes its 6-year construction in 1993, the name of which was decided by vote by the public. The suspension bridge connects Shibaura Pier and Odaiba across the Tokyo Bay.");
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
