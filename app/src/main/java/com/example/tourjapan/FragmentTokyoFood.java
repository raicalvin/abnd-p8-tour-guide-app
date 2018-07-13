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

        food.add(new Food("The great something of kobe", R.drawable.filler1));
        food.add(new Food("The great something of food", R.drawable.filler2));
        food.add(new Food("The great something of ice cream", R.drawable.filler3));
        food.add(new Food("The great something of something", R.drawable.filler1));
        food.add(new Food("The great something of kobe", R.drawable.filler1));
        food.add(new Food("The great something of what is this", R.drawable.filler3));
        food.add(new Food("The great something of kobe", R.drawable.filler2));
        food.add(new Food("The great something of hello", R.drawable.filler1));
        food.add(new Food("The great something of kobe", R.drawable.filler2));
        food.add(new Food("The great something of hi", R.drawable.filler1));
        food.add(new Food("The great something of kobe", R.drawable.filler2));
        food.add(new Food("The great something of something else", R.drawable.filler1));
        food.add(new Food("The great something of kobe", R.drawable.filler3));
        food.add(new Food("The great something of sushi", R.drawable.filler3));

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
