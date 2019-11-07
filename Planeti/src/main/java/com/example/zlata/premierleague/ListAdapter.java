package com.example.zlata.premierleague;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zlata on 24/10/2017.
 */

public class ListAdapter extends ArrayAdapter<Match> {
    static String statteam1;
    static    String statteam2;


    public ListAdapter(Context context, int resource, List<Match> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.item_contact, null);

        }

        Match p = getItem(position);

        if (p != null) {

            TextView team1 = (TextView) v.findViewById(R.id.team1);
            statteam1=team1.getText().toString();

            if (team1 != null) {
                team1.setText(p.getTeam1());

            }
            TextView team2 = (TextView) v.findViewById(R.id.team2);
            statteam2=team2.getText().toString();

            if (team2 != null) {
                team2.setText(p.getTeam2());


            }

            ImageView imgteam1 = (ImageView) v.findViewById(R.id.imgteam1);

            if (imgteam1 != null) {
                imgteam1.setImageResource(p.getImgteam1());


            }

            ImageView imgteam2 = (ImageView) v.findViewById(R.id.imgteam2);

            if (imgteam2 != null) {
                imgteam2.setImageResource(p.getImgteam2());


            }

            //TextView datematch=(TextView) v.findViewById(R.id.datematch);
           // if (datematch != null) {
             //   datematch.setText(p.getJounee());

          //  }








        }

        return v;
    }
}