package com.example.tourjapan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("The great something of japan", R.drawable.filler1));
        places.add(new Places("The great something of asia", R.drawable.filler2));
        places.add(new Places("The great something of canada", R.drawable.filler3));
        places.add(new Places("The great something of singapore", R.drawable.filler1));
        places.add(new Places("The great something of iceland", R.drawable.filler2));
        places.add(new Places("The great something of kyoto", R.drawable.filler2));
        places.add(new Places("The great something of osaka", R.drawable.filler3));
        places.add(new Places("The great something of nagoya", R.drawable.filler1));
        places.add(new Places("The great something of nara", R.drawable.filler3));
        places.add(new Places("The great something of mars", R.drawable.filler1));
        places.add(new Places("The great something of venus", R.drawable.filler2));
        places.add(new Places("The great something of jupiter", R.drawable.filler1));
        places.add(new Places("The great something of target", R.drawable.filler2));
        places.add(new Places("The great something of panera bread", R.drawable.filler1));
        places.add(new Places("The great something of gomez", R.drawable.filler1));
        places.add(new Places("The great something of magome", R.drawable.filler1));
        places.add(new Places("The great something of naha", R.drawable.filler2));
        places.add(new Places("The great something of chiba", R.drawable.filler3));
        places.add(new Places("The great something of kobe", R.drawable.filler1));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(adapter);

        return rootView;

    }

}
