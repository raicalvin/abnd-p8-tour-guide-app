package com.example.tourjapan;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTokyoPlaces extends Fragment {


    public FragmentTokyoPlaces() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("Akihabara Station", R.drawable.places_icon_akihabara_station, getString(R.string.place_1), R.drawable.places_akihabara_station));
        places.add(new Places("Ameyoko Shopping Street", R.drawable.places_icon_ameyoko_shopping_street, getString(R.string.place_2), R.drawable.places_ameyoko_shopping_street));
        places.add(new Places("Ginza", R.drawable.places_icon_ginza, getString(R.string.place_3), R.drawable.places_ginza));
        places.add(new Places("Imperial Palace", R.drawable.places_icon_imperial_palace, getString(R.string.place_1), R.drawable.places_imperial_palace));
        places.add(new Places("Meiji Temple", R.drawable.places_icon_meiji_temple, getString(R.string.place_2), R.drawable.places_meiji_temple));
        places.add(new Places("Nissan Crossing", R.drawable.places_icon_nissan_crossing, getString(R.string.place_2), R.drawable.places_nissan_crossing));
        places.add(new Places("Senso-Ji Temple", R.drawable.places_icon_sensoji_temple, getString(R.string.place_3), R.drawable.places_sensoji_temple));
        places.add(new Places("Shinjuku", R.drawable.places_icon_shinjuku, getString(R.string.place_3), R.drawable.places_shinjuku));
        places.add(new Places("Tokyo Skytree", R.drawable.places_icon_tokyo_skytree, getString(R.string.place_3), R.drawable.places_tokyo_skytree));
        places.add(new Places("Ueno Park", R.drawable.places_icon_ueno_park, getString(R.string.place_1), R.drawable.places_ueno_park));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(rootView.getContext(), PlacesActivity.class);
                intent.putExtra("Place-Description", places.get(position).getPlaceDescription());
                intent.putExtra("Place-Image", places.get(position).getHeaderResourceID());
                startActivity(intent);
            }
        });

        return rootView;

    }

}
