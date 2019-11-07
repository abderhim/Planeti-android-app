package com.example.zlata.premierleague;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Mohamed on 26/11/2017.
 */

public class HomeActivity extends AppCompatActivity {
    EditText editTest;
    Button btnTest;
    JSONParser jsonParser=new JSONParser();
    static int CurrentId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        editTest=(EditText)findViewById(R.id.editTexttest);
        btnTest=(Button)findViewById(R.id.button2);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             AttemptTest attempttest= new  AttemptTest();
                attempttest.execute(editTest.getText().toString(),"");

            }
        });

    }

//A changer plus tard à AttemptMatch
    private class AttemptTest extends AsyncTask<String, String, JSONObject> {

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

        }

        @Override

        protected JSONObject doInBackground(String... args) {



            String textCoupon = args[0];


            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("textCoupon", textCoupon));



            SharedPreferences shared=getSharedPreferences("pref",MODE_PRIVATE);
            int id= shared.getInt("idUser",0);
            System.out.println(id);
            CurrentId=id;
            String URL= "http://10.0.2.2/index3.php?id="+id;
            // JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);
            JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);

            return json;

        }

        protected void onPostExecute(JSONObject result) {

            // dismiss the dialog once product deleted
            //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            try {
                if (result != null) {
                    Toast.makeText(getApplicationContext(),result.getString("message"),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Unable to retrieve any data from server", Toast.LENGTH_LONG).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

    }
}
