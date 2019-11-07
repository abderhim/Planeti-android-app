package com.example.zlata.premierleague;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zlata on 11/11/2017.
 */

public class BundesligaActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    static String statteam1;
    static String statteam2;
    static String team1score;
    static String team2score;
    private ListView lvcontact;
    static JSONObject t;
    SwipeRefreshLayout swipeRefreshLayout;
    DatabaseHandler db;
    Session s;
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        lvcontact = (ListView) findViewById(R.id.lstContact);
        s= new Session(this);
        swipeRefreshLayout=(SwipeRefreshLayout)findViewById(R.id.swipe_refresh_layout);
        db = new DatabaseHandler(this);
        swipeRefreshLayout.setOnRefreshListener(this);
        // swipeRefreshLayout.setOnRefreshListener(this);
        if(!s.loggedin()){

            db.delete();
        }

        swipeRefreshLayout.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        swipeRefreshLayout.setRefreshing(true);

                                        findmatches();
                                    }
                                }
        );




        lvcontact.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView team1 = (TextView)view.findViewById(R.id.team1);
                TextView team2 = (TextView) view.findViewById(R.id.team2);

                statteam1=team1.getText().toString();
                statteam2=team2.getText().toString();
                Intent myIntent = new Intent(view.getContext(),StatspremActivity.class);
                myIntent.putExtra("statteam1",statteam1);
                myIntent.putExtra("statteam2",statteam2);
                myIntent.putExtra("team1score",team1score);
                myIntent.putExtra("team2score",team2score);
                System.out.println(team1score);
                // myIntent.putExtra("t",t.toString());
                // myIntent.putExtra("t",t);

                startActivity(myIntent);

            }
        });



    }

    public void findmatches(){

        StringRequest stringRequest = new StringRequest(Request.Method.GET, "https://raw.githubusercontent.com/opendatajson/football.json/master/2017-18/de.1.json",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);

                        try {

                            JSONObject prem = new JSONObject(response);
                            JSONArray rounds =prem.getJSONArray("rounds");



                            ArrayList<Match> listE = new ArrayList<>();



                            for (int i=0; i<rounds.length();i++){
                                JSONObject obj = rounds.getJSONObject(i);


                                // JSONObject matchday = obj.getJSONObject("name");
                                JSONArray matches =obj.getJSONArray("matches");
                                for (int j=0; j<matches.length();j++){
                                    JSONObject team1 = matches.getJSONObject(j);
                                    t=team1;
                                    JSONObject t1=team1.getJSONObject("team1");
                                    JSONObject t2=team1.getJSONObject("team2");
                                    Match e = new Match();
                                    e.setTeam1(t1.getString("name"));
                                    e.setTeam2(t2.getString("name"));
                                    team1score=e.getTeam1();
                                    team1score=e.getTeam2();
                                    e.setJounee(team1.getString("date"));
                                    e.setMatchday(obj.getString("name"));
                                    if(e.getTeam1().equals("FC Bayern München")) {
                                        e.setImgteam1(R.drawable.bayern);
                                    }
                                    if(e.getTeam1().equals("Borussia Dortmund")) {
                                        e.setImgteam1(R.drawable.dortmund);
                                    }
                                    if(e.getTeam1().equals("Bayer 04 Leverkusen")) {
                                        e.setImgteam1(R.drawable.leverkusen);
                                    }
                                    if(e.getTeam1().equals("Schalke 04")) {
                                        e.setImgteam1(R.drawable.schalke);
                                    }
                                    if(e.getTeam1().equals("Eintracht Frankfurt")) {
                                        e.setImgteam1(R.drawable.eintrachtfrankfurt);
                                    }
                                    if(e.getTeam1().equals("Hamburger SV")) {
                                        e.setImgteam1(R.drawable.hamburg);
                                    }
                                    if(e.getTeam1().equals("Borussia M'gladbach")) {
                                        e.setImgteam1(R.drawable.gladbach);
                                    }
                                    if(e.getTeam1().equals("Hannover 96")) {
                                        e.setImgteam1(R.drawable.hannover);
                                    }
                                    if(e.getTeam1().equals("Burnley")) {
                                        e.setImgteam1(R.drawable.burnleyabd);
                                    }
                                    if(e.getTeam1().equals("VfL Wolfsburg")) {
                                        e.setImgteam1(R.drawable.wolfsburg);
                                    }

                                    if(e.getTeam1().equals("1. FSV Mainz 05")) {
                                        e.setImgteam1(R.drawable.mainz);
                                    }
                                    if(e.getTeam1().equals("Werder Bremen")) {
                                        e.setImgteam1(R.drawable.werderbremen);
                                    }
                                    if(e.getTeam1().equals("1899 Hoffenheim")) {
                                        e.setImgteam2(R.drawable.hoffeinhaim);
                                    }
                                    if(e.getTeam1().equals("VfB Stuttgart")) {
                                        e.setImgteam1(R.drawable.stuttgart);
                                    }
                                    if(e.getTeam1().equals("FC Augsburg")) {
                                        e.setImgteam1(R.drawable.augsburg);
                                    }
                                    if(e.getTeam1().equals("Hertha BSC")) {
                                        e.setImgteam1(R.drawable.herthaberlin);
                                    }
                                    if(e.getTeam1().equals("1. FC Köln")) {
                                        e.setImgteam1(R.drawable.koln);
                                    }
                                    if(e.getTeam1().equals("SC Freiburg")) {
                                        e.setImgteam1(R.drawable.freiburg);
                                    }
                                    if(e.getTeam1().equals("RB Leipzig")) {
                                        e.setImgteam1(R.drawable.leipzig);
                                    }


                                    if(e.getTeam2().equals("FC Bayern München")) {
                                        e.setImgteam2(R.drawable.bayern);
                                    }
                                    if(e.getTeam2().equals("Borussia Dortmund")) {
                                        e.setImgteam2(R.drawable.dortmund);
                                    }
                                    if(e.getTeam2().equals("Bayer 04 Leverkusen")) {
                                        e.setImgteam2(R.drawable.leverkusen);
                                    }
                                    if(e.getTeam2().equals("Schalke 04")) {
                                        e.setImgteam2(R.drawable.schalke);
                                    }
                                    if(e.getTeam2().equals("Eintracht Frankfurt")) {
                                        e.setImgteam2(R.drawable.eintrachtfrankfurt);
                                    }
                                    if(e.getTeam2().equals("Hamburger SV")) {
                                        e.setImgteam2(R.drawable.hamburg);
                                    }
                                    if(e.getTeam2().equals("Borussia M'gladbach")) {
                                        e.setImgteam2(R.drawable.gladbach);
                                    }
                                    if(e.getTeam2().equals("Hannover 96")) {
                                        e.setImgteam2(R.drawable.hannover);
                                    }
                                    if(e.getTeam2().equals("Burnley")) {
                                        e.setImgteam2(R.drawable.burnleyabd);
                                    }
                                    if(e.getTeam2().equals("VfL Wolfsburg")) {
                                        e.setImgteam2(R.drawable.wolfsburg);
                                    }

                                    if(e.getTeam2().equals("1. FSV Mainz 05")) {
                                        e.setImgteam2(R.drawable.mainz);
                                    }
                                    if(e.getTeam2().equals("Werder Bremen")) {
                                        e.setImgteam2(R.drawable.werderbremen);
                                    }
                                    if(e.getTeam2().equals("1899 Hoffenheim")) {
                                        e.setImgteam2(R.drawable.hoffeinhaim);
                                    }
                                    if(e.getTeam2().equals("VfB Stuttgart")) {
                                        e.setImgteam2(R.drawable.stuttgart);
                                    }
                                    if(e.getTeam2().equals("FC Augsburg")) {
                                        e.setImgteam2(R.drawable.augsburg);
                                    }
                                    if(e.getTeam2().equals("Hertha BSC")) {
                                        e.setImgteam2(R.drawable.herthaberlin);
                                    }
                                    if(e.getTeam2().equals("2. FC Köln")) {
                                        e.setImgteam2(R.drawable.koln);
                                    }
                                    if(e.getTeam2().equals("SC Freiburg")) {
                                        e.setImgteam2(R.drawable.freiburg);
                                    }
                                    if(e.getTeam2().equals("RB Leipzig")) {
                                        e.setImgteam2(R.drawable.leipzig);
                                    }






                                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                                    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                    Date date1 = format.parse(e.getJounee().toString());
                                    Date date2=format1.parse("2017-11-26");
                                    Date date = new Date();
                                    String datetoday=format.format(date);
                                    Date aujou =format.parse(datetoday);
                                    if(date1.compareTo(aujou)>=0){

                                        if ( listE.size()<9){
                                            listE.add(e);
                                            System.out.println(obj.getString("name"));
                                            setTitle(obj.getString("name"));
                                        }
                                        //setTitle(obj.getString("name"));




                                    }



                                }



                            }

                            //   System.out.println(listE.toString());




                            ListAdapter customAdapter = new ListAdapter(getApplicationContext() , R.layout.activity_main, listE);

                            lvcontact.setAdapter(customAdapter);


                            swipeRefreshLayout.setRefreshing(false);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("That didn't work!"+error);

            }
        });
        swipeRefreshLayout.setRefreshing(false);
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(stringRequest);



    }


    @Override
    public void onRefresh() {
        findmatches();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu=menu;
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_about:
                startActivity(new Intent(BundesligaActivity.this,  Coupon.class));
                finish();
                return true;
            case R.id.logout:
                s= new Session(this);
                s.setLoggedin(false);
                startActivity(new Intent(BundesligaActivity.this,  Login.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(BundesligaActivity.this,  Leagues.class));
    }
}
