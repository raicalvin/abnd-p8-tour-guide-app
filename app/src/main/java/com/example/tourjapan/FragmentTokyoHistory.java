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
import android.widget.Toast;

import java.lang.reflect.Array;
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

        history.add(new History("The great something of japan", "March 09, 1908"));
        history.add(new History("The great something of asia", "March 43, 1908"));
        history.add(new History("The great something of india", "March 09, 1508"));
        history.add(new History("The great something of nigeria", "March 032, 1908"));
        history.add(new History("The great something of mcdonalds", "March 39, 1908"));
        history.add(new History("The great something of taco bell", "March 09, 1108"));
        history.add(new History("The great something of dog", "March 09, 1908"));
        history.add(new History("The great something of cat", "March 459, 3208"));
        history.add(new History("The great something of kyoto", "March 09, 1908"));
        history.add(new History("The great something of osaka", "March 09, 1908"));
        history.add(new History("The great something of nigeria", "March 032, 1908"));
        history.add(new History("The great something of mcdonalds", "March 39, 1908"));
        history.add(new History("The great something of taco bell", "March 09, 1108"));
        history.add(new History("The great something of dog", "March 09, 1908"));
        history.add(new History("The great something of cat", "March 459, 3208"));
        history.add(new History("The great something of kyoto", "March 09, 1908"));

        HistoryAdapter adapter = new HistoryAdapter(getActivity(), history);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(rootView.getContext(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
