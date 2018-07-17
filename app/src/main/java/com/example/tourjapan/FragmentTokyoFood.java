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
public class FragmentTokyoFood extends Fragment {


    public FragmentTokyoFood() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Food> food = new ArrayList<>();

        food.add(new Food("Sushi at Akihabara Station", R.drawable.food_icon_akihabara_station_sushi));
        food.add(new Food("Matsuya", R.drawable.food_icon_matsuya));
        food.add(new Food("Tokyo Tanmen Tonari", R.drawable.food_icon_tanmen_tonari));
        food.add(new Food("Ueno French Toast", R.drawable.food_icon_ueno_french_toast));
        food.add(new Food("Vie De France Bakery", R.drawable.food_icon_vie_de_france));
        food.add(new Food("Mr. Waffle", R.drawable.food_icon_mr_waffle));

        FoodAdapter adapter = new FoodAdapter(getActivity(), food);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(rootView.getContext(), FoodActivity.class);
                intent.putExtra("Food-Description", food.get(position).getFoodTitle());
                intent.putExtra("Food-Image", food.get(position).getPicResourceID());
                startActivity(intent);
            }
        });

        return rootView;
    }

}
