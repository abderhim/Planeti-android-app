package com.example.zlata.premierleague;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zlata on 10/11/2017.
 */

public class Leagues  extends AppCompatActivity {
DatabaseHandler db;
Session s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leagues);

        ImageView img = (ImageView) findViewById(R.id.pleague);
        ImageView img2 = (ImageView) findViewById(R.id.calcio);
        ImageView img3 = (ImageView) findViewById(R.id.bundsliga);
        ImageView img4 = (ImageView) findViewById(R.id.ligaa);
        db = new DatabaseHandler(this);


        setTitle("LEAGUES");
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Leagues.this,  MainActivity.class));
                finish();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Leagues.this,  CalcioActivity.class));
                finish();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Leagues.this,  BundesligaActivity.class));
                finish();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Leagues.this,  LigaActivity.class));
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        startActivity(new Intent(Leagues.this,  Coupon.class));
        finish();
        return true;


    }



}