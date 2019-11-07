package com.example.zlata.premierleague;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;
import static com.facebook.FacebookSdk.getApplicationContext;

/**
 * Created by zlata on 03/12/2017.
 */

public class MatchtaamirAdapter  extends ArrayAdapter<Matchtamir> {

    JSONParser jsonParser=new JSONParser();


    public MatchtaamirAdapter(Context context, int resource, List<Matchtamir> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View v=convertView;

        if(v==null){
            LayoutInflater vi;
            vi=LayoutInflater.from(getContext());
            v=vi.inflate(R.layout.itemcouponlayout,null);

        }

        Matchtamir p=getItem(position);

        if(p!=null){

            final TextView team1=(TextView)v.findViewById(R.id.teamtaamir1);

            if(team1!=null){
                team1.setText(p.getTeamlawal());
            }
            final TextView team2=(TextView)v.findViewById(R.id.teamtaamir2);

            if(team2!=null){
                team2.setText(p.getTeamtheni());

            }

            TextView datematch=(TextView)v.findViewById(R.id.chnowaamar);
            if(datematch!=null){
                datematch.setText(p.getTaamira());

            }
            Button deletematch=(Button)v.findViewById(R.id.delete);

            deletematch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    SharedPreferences shared=view.getContext().getSharedPreferences("pref",MODE_PRIVATE);
                    int id= shared.getInt("idUser",0);
                    AttemptTest attempttest= new  AttemptTest();
                    attempttest.execute( team1.getText().toString(),team2.getText().toString(), String.valueOf(id) );
                    Toast.makeText(getApplicationContext(), "match supprimé avec succès", Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(getContext(), Coupon.class);
                    getContext().startActivity(intent);


                }
            });

        }








        return v;


    }
    private class AttemptTest extends AsyncTask<String,Void, JSONObject> {

        @Override

        protected void onPreExecute() {

            super.onPreExecute();


        }

        @Override

        protected JSONObject doInBackground(String... args) {



            String equipe1 = args[0];
            String equipe2 = args[1];
           String ids=args[2];
           int id=Integer.valueOf(ids);


            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("equipe1", equipe1));
            params.add(new BasicNameValuePair("equipe2", equipe2));


            System.out.println(id);
            String URL= "http://172.16.158.131/index5.php?id="+id;
            JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);


            return json;

        }

        protected void onPostExecute() {//JSONObject result

            // dismiss the dialog once product deleted
            //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

//            try {
//                if (result != null) {
//                    Toast.makeText(getApplicationContext(),result.getString("msg"),Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Unable to retrieve any data from server", Toast.LENGTH_LONG).show();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }


        }

    }}
