package com.example.zlata.premierleague;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zlata on 10/11/2017.
 */

public class ListjourneeAdapter extends ArrayAdapter<matchday> {

    public ListjourneeAdapter(Context context, int resource, List<matchday> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.expand, null);

        }

        matchday p = getItem(position);
        TextView matchday = (TextView) v.findViewById(R.id.matchday);
        if (matchday != null) {
            matchday.setText(p.getName());
        }





        return v;
    }
}