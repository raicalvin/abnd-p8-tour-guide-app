package com.example.tourjapan;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTokyoHistory extends Fragment {


    public FragmentTokyoHistory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<History> history = new ArrayList<>();

        String fragmentName = getActivity().getClass().getSimpleName();

        history.add(new History("Sensoji Temple", "645"));
        history.add(new History("Edo Castle is Built", "1457"));
        history.add(new History("The Edo Period Begins", "1603-1868"));
        history.add(new History("Takashi Hara is Assassinated", "November 4, 1921"));
        history.add(new History("The Great Kanto Earthquake", "September 1, 1923"));
        history.add(new History("The First Tokyo Metro Line", "December 30th 1927"));
        history.add(new History("Tokyo’s Population Reaches 10 million", "1962"));
        history.add(new History("1964 Summer Olympics", "October 10, 1964"));
        history.add(new History("The Rainbow Bridge in Tokyo Bay is Opened", "August 27, 1993"));

        HistoryAdapter adapter = new HistoryAdapter(getActivity(), history);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(adapter);

        String cityName = getCityNameFromFragment(getActivity().getClass().getSimpleName());

        final HistoryEvents tokyoEvents = new HistoryEvents(cityName);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(rootView.getContext(), HistoryActivity.class);
                intent.putExtra("Event-Description", tokyoEvents.getValue(history.get(position).getEventTitle()));
                intent.putExtra("Event-Date", history.get(position).getEventDate());
                intent.putExtra("Event-Title", history.get(position).getEventTitle());
                startActivity(intent);
            }
        });

        return rootView;
    }

    /**
     * This will return the city name from the fragment activity name passed into it
     * @param fragName
     * @return
     */
    private String getCityNameFromFragment(String fragName) {
        if (fragName.contains("Tokyo")) {
            return "Tokyo";
        } else if (fragName.contains("Kyoto")) {
            return "Kyoto";
        } else if (fragName.contains("Nakatsugawa")) {
            return "Nakatsugawa";
        } else if (fragName.contains("Osaka")) {
            return "Osaka";
        } else {
            return "Nagoya";
        }
    }

}
