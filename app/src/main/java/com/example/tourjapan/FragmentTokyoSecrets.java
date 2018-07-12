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
public class FragmentTokyoSecrets extends Fragment {


    public FragmentTokyoSecrets() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Secret> secrets = new ArrayList<>();

        secrets.add(new Secret("Secret1"));
        secrets.add(new Secret("Secret2"));
        secrets.add(new Secret("Secret3"));
        secrets.add(new Secret("Secret4"));
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

        String cityName = getCityNameFromFragment(getActivity().getClass().getSimpleName());

        final SecretContent tokyoSecrets = new SecretContent(cityName);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(rootView.getContext(), SecretsActivity.class);
                intent.putExtra("Secret-Description", tokyoSecrets.getValue(secrets.get(position).getSecretTitle()));
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
