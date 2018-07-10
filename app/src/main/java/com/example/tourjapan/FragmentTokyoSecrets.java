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
public class FragmentTokyoSecrets extends Fragment {


    public FragmentTokyoSecrets() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Secret> secrets = new ArrayList<>();

        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));
        secrets.add(new Secret("The Hidden Tunnel of Something"));


        SecretAdapter adapter = new SecretAdapter(getActivity(), secrets);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(adapter);

        return rootView;
    }

}
