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

public class SecretAdapter extends ArrayAdapter<Secret> {

    public SecretAdapter(Context context, ArrayList<Secret> secrets) {
        super(context, 0, secrets);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the secret item to use
        Secret secretItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView secretTitleTV = (TextView) convertView.findViewById(R.id.history_title_text_view);

        ImageView secretIconIV = (ImageView) convertView.findViewById(R.id.image_icon);
        secretIconIV.setVisibility(View.GONE);

        TextView otherTV = (TextView) convertView.findViewById(R.id.history_date_text_view);
        otherTV.setVisibility(View.GONE);

        secretTitleTV.setText(secretItem.getSecretTitle());

        return convertView;
    }

}
