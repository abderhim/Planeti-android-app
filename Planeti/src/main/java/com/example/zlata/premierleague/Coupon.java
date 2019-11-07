package com.example.zlata.premierleague;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Coupon extends AppCompatActivity {
ListView lstmatchs;
Session s;
   // DatabaseHandler db;
    JSONParser jsonParser=new JSONParser();
    HttpPost httppost;
    AppCompatActivity context;
    StringBuffer buffer;

    HttpResponse response;

    HttpClient httpclient;

    ProgressDialog pd;
    List<Matchtamir> matchtaamir;
    MatchtaamirAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
       matchtaamir = new ArrayList<>();

        lstmatchs = (ListView) findViewById(R.id.lstcoupons);

setTitle("Your Matches");







   adapter = new MatchtaamirAdapter(this,R.layout.itemcouponlayout,matchtaamir );
        lstmatchs.setAdapter(adapter);






    }
    public void onStart(){

        super.onStart();



        AttemptTest bt=new AttemptTest();

        bt.execute();



    }


    private class AttemptTest extends AsyncTask<Void,Void,Void> {

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

        }

        @Override

        protected Void doInBackground(Void...params) {

            InputStream is=null;

            String result="";

            try{



                httpclient=new DefaultHttpClient();
                SharedPreferences shared=getSharedPreferences("pref",MODE_PRIVATE);
                int id= shared.getInt("idUser",0);

                httppost= new HttpPost("http://172.16.158.131/index4.php?iduser="+id);

                response=httpclient.execute(httppost);

                HttpEntity entity = response.getEntity();



                is = entity.getContent();



            }catch(Exception e){





                Log.e("ERROR", e.getMessage());



            }





            try{

                BufferedReader reader = new BufferedReader(new InputStreamReader(is,"utf-8"),8);

                StringBuilder sb = new StringBuilder();

                String line = null;

                while ((line = reader.readLine()) != null) {

                    sb.append(line+"\n");

                }

                is.close();

                result=sb.toString();

            }catch(Exception e){

                Log.e("ERROR", "Error converting result "+e.toString());



            }



            //parse json data

            try{



                        result=result.substring(result.indexOf("["));

                JSONArray jArray =new JSONArray(result);

                for(int i=0;i<jArray.length();i++){

                    JSONObject json_data =jArray.getJSONObject(i);

                    Matchtamir m=new Matchtamir();

                    m.setTeamlawal(json_data.getString("equipe1"));

                    m.setTeamtheni(json_data.getString("equipe2"));
                    m.setTaamira(json_data.getString("choix"));



                    matchtaamir.add(m);



                }





            }

            catch(Exception e){

                Log.e("ERROR", "Error pasting data "+e.toString());





            }



            return null;

        }















        }

        protected void onPostExecute(Void result) {

            if(pd!=null) pd.dismiss(); //close dialog

            Log.e("size", matchtaamir.size() + "");

            adapter.notifyDataSetChanged(); //notify the ListView to get new records


        }



    @Override
    public void onBackPressed() {
        startActivity(new Intent(Coupon.this,  Leagues.class));
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_about:
                startActivity(new Intent(Coupon.this,  Coupon.class));
                finish();
                return true;
            case R.id.logout:
                s= new Session(this);
                s.setLoggedin(false);
                startActivity(new Intent(Coupon.this,  Login.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
