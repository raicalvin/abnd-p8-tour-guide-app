package com.example.tourjapan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter {

    public FoodAdapter(Context context, ArrayList<Food> food) {
        super(context, 0, food);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the Food item to use
        Food foodItem = (Food) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView otherTV = (TextView) convertView.findViewById(R.id.history_date_text_view);
        otherTV.setVisibility(View.GONE);

        TextView foodTitleTV = (TextView) convertView.findViewById(R.id.history_title_text_view);
        ImageView foodImageIV = (ImageView) convertView.findViewById(R.id.image_icon);

        foodTitleTV.setText(foodItem.getFoodTitle());
        foodImageIV.setImageResource(foodItem.getPicResourceID());

        return convertView;
    }
}
