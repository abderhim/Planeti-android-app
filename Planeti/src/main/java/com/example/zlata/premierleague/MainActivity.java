package com.example.zlata.premierleague;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.SwipeRefreshLayout;
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

    public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

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

        StringRequest stringRequest = new StringRequest(Request.Method.GET, "https://raw.githubusercontent.com/opendatajson/football.json/master/2017-18/en.1.json",
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
                                    if(e.getTeam1().equals("Chelsea")) {
                                        e.setImgteam1(R.drawable.chelseaabd);
                                    }
                                    if(e.getTeam2().equals("Chelsea")) {
                                        e.setImgteam2(R.drawable.chelseaabd);
                                    }
                                    if(e.getTeam1().equals("Arsenal")) {
                                        e.setImgteam1(R.drawable.arsenalabd);
                                    }
                                    if(e.getTeam2().equals("Arsenal")) {
                                        e.setImgteam2(R.drawable.arsenalabd);
                                    }
                                    if(e.getTeam1().equals("Bournemouth")) {
                                        e.setImgteam1(R.drawable.bounmouthabd);
                                    }
                                    if(e.getTeam2().equals("Bournemouth")) {
                                        e.setImgteam2(R.drawable.bounmouthabd);
                                    }
                                    if(e.getTeam1().equals("Manchester United")) {
                                        e.setImgteam1(R.drawable.maan);
                                    }
                                    if(e.getTeam2().equals("Manchester United")) {
                                        e.setImgteam2(R.drawable.maan);
                                    }
                                    if(e.getTeam1().equals("Burnley")) {
                                        e.setImgteam1(R.drawable.burnleyabd);
                                    }
                                    if(e.getTeam2().equals("Burnley")) {
                                        e.setImgteam2(R.drawable.burnleyabd);
                                    }
                                    if(e.getTeam1().equals("Manchester City")) {
                                        e.setImgteam1(R.drawable.cityabd);
                                    }
                                    if(e.getTeam2().equals("Manchester City")) {
                                        e.setImgteam2(R.drawable.cityabd);
                                    }
                                    if(e.getTeam1().equals("Crystal Palace")) {
                                        e.setImgteam1(R.drawable.crystalabd);
                                    }
                                    if(e.getTeam2().equals("Crystal Palace")) {
                                        e.setImgteam2(R.drawable.crystalabd);
                                    }
                                    if(e.getTeam1().equals("Arsenal")) {
                                        e.setImgteam1(R.drawable.arsenalabd);
                                    }
                                    if(e.getTeam2().equals("Arsenal")) {
                                        e.setImgteam2(R.drawable.arsenalabd);
                                    }
                                    if(e.getTeam1().equals("Leicester City")) {
                                        e.setImgteam1(R.drawable.leicesterabd);
                                    }
                                    if(e.getTeam2().equals("Leicester City")) {
                                        e.setImgteam2(R.drawable.leicesterabd);
                                    }
                                    if(e.getTeam1().equals("Liverpool")) {
                                        e.setImgteam1(R.drawable.liverabd);
                                    }
                                    if(e.getTeam2().equals("Liverpool")) {
                                        e.setImgteam2(R.drawable.liverabd);
                                    }
                                    if(e.getTeam1().equals("Southampton")) {
                                        e.setImgteam1(R.drawable.southamptonabd);
                                    }
                                    if(e.getTeam2().equals("Southampton")) {
                                        e.setImgteam2(R.drawable.southamptonabd);
                                    }
                                    if(e.getTeam1().equals("Tottenham Hotspur")) {
                                        e.setImgteam1(R.drawable.spursabd);
                                    }
                                    if(e.getTeam2().equals("Tottenham Hotspur")) {
                                        e.setImgteam2(R.drawable.spursabd);
                                    }
                                    if(e.getTeam1().equals("Stoke City")) {
                                        e.setImgteam1(R.drawable.stockabd);
                                    }
                                    if(e.getTeam2().equals("Stoke City")) {
                                        e.setImgteam2(R.drawable.stockabd);
                                    }
                                    if(e.getTeam1().equals("Swansea")) {
                                        e.setImgteam1(R.drawable.swanseyabd);
                                    }
                                    if(e.getTeam2().equals("Swansea")) {
                                        e.setImgteam2(R.drawable.swanseyabd);
                                    }
                                    if(e.getTeam1().equals("Everton")) {
                                        e.setImgteam1(R.drawable.evertonabd);
                                    }
                                    if(e.getTeam2().equals("Everton")) {
                                        e.setImgteam2(R.drawable.evertonabd);
                                    }
                                    if(e.getTeam1().equals("Watford")) {
                                        e.setImgteam1(R.drawable.watfordabd);
                                    }
                                    if(e.getTeam2().equals("Watford")) {
                                        e.setImgteam2(R.drawable.watfordabd);
                                    }
                                    if(e.getTeam1().equals("West Bromwich Albion")) {
                                        e.setImgteam1(R.drawable.westbromabd);
                                    }
                                    if(e.getTeam2().equals("West Bromwich Albion")) {
                                        e.setImgteam2(R.drawable.westbromabd);
                                    }
                                    if(e.getTeam1().equals("West Ham United")) {
                                        e.setImgteam1(R.drawable.westhamabd);
                                    }
                                    if(e.getTeam2().equals("West Ham United")) {
                                        e.setImgteam2(R.drawable.westhamabd);
                                    }
                                    if(e.getTeam1().equals("Newcastle United")) {
                                        e.setImgteam1(R.drawable.newcastleabdpng);
                                    }
                                    if(e.getTeam2().equals("Newcastle United")) {
                                        e.setImgteam2(R.drawable.newcastleabdpng);
                                    }
                                    if(e.getTeam1().equals("Huddersfield Town")) {
                                        e.setImgteam1(R.drawable.huddersfiledabd);
                                    }
                                    if(e.getTeam2().equals("Huddersfield Town")) {
                                        e.setImgteam2(R.drawable.huddersfiledabd);
                                    }
                                    if(e.getTeam1().equals("Brighton & Hove Albion")) {
                                        e.setImgteam1(R.drawable.brightonabd);
                                    }
                                    if(e.getTeam2().equals("Brighton & Hove Albion")) {
                                        e.setImgteam2(R.drawable.brightonabd);
                                    }





                                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                                    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                    Date date1 = format.parse(e.getJounee().toString());
                                    Date date2=format1.parse("2017-11-26");
                                    Date date = new Date();
                                    String datetoday=format.format(date);
                                    Date aujou =format.parse(datetoday);
                                    if(date1.compareTo(aujou)>=0){

                                        if ( listE.size()<10){
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
        startActivity(new Intent(MainActivity.this,  Coupon.class));
        finish();
        return true;
            case R.id.logout:
                s= new Session(this);
                s.setLoggedin(false);
                startActivity(new Intent(MainActivity.this,  Login.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
    }}

    @Override
    public void onBackPressed() {
        startActivity(new Intent(MainActivity.this,  Leagues.class));
    }
}
