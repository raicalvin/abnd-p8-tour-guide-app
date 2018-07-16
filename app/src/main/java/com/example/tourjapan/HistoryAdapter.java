package com.example.tourjapan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HistoryAdapter extends ArrayAdapter<History> {

    public HistoryAdapter(Context context, ArrayList<History> events) {
        super(context, 0, events);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the History item to use
        History historyItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView eventTV = convertView.findViewById(R.id.history_title_text_view);
        TextView dateTV = convertView.findViewById(R.id.history_date_text_view);

        eventTV.setText(historyItem.getEventTitle());
        dateTV.setText(historyItem.getEventDate());

        return convertView;
    }
}
