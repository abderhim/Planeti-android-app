package com.example.zlata.premierleague;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Login extends AppCompatActivity {


    EditText editEmail, editPassword, editName;
    Button btnSignIn, btnRegister;
    String URL= "http://172.16.158.131/index.php";

    //String URL= "http://10.0.2.2/index.php?id=";

    JSONParser jsonParser=new JSONParser();
    JSONObject json=null ;
    int i=0;

    Session s;
     CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setTitle("LOGIN");


        editEmail=(EditText)findViewById(R.id.editEmail);
        editName=(EditText)findViewById(R.id.editName);
        editPassword=(EditText)findViewById(R.id.editPassword);
        s= new Session(this);
        btnSignIn=(Button)findViewById(R.id.btnSignIn);
        btnRegister=(Button)findViewById(R.id.btnRegister);
        if(s.loggedin()){

            startActivity(new Intent(Login.this, Leagues.class));



            finish();

        }

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editName.getText().toString().equals("")||editPassword.getText().toString().equals("")){

    AlertDialog.Builder builder2=new AlertDialog.Builder( Login.this);
    builder2.setMessage("Login ou mot de passe incorrects !!");
    builder2.setNeutralButton("OK", null) ;
    AlertDialog alert=builder2.create();
    alert.show();


}else{
                AttemptLogin attemptLogin= new AttemptLogin();
                attemptLogin.execute(editName.getText().toString(),editPassword.getText().toString(),"");
               s.setLoggedin(true);

                }

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i==0)
                {
                    i=1;
                    editEmail.setVisibility(View.VISIBLE);
                    btnSignIn.setVisibility(View.GONE);
                    //btnRegister.setText("CREATE ACCOUNT");
                }
                else{

                   // btnRegister.setText("REGISTER");
                    editEmail.setVisibility(View.GONE);
                    btnSignIn.setVisibility(View.VISIBLE);
                    i=0;

                    AttemptLogin attemptLogin= new AttemptLogin();
                    attemptLogin.execute(editName.getText().toString(),editPassword.getText().toString(),editEmail.getText().toString());

                }

            }
        });


    }

    private class AttemptLogin extends AsyncTask<String, String, JSONObject> {

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

        }

        @Override

        protected JSONObject doInBackground(String... args) {



            String email = args[2];
            String password = args[1];
            String name= args[0];

            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("username", name));
            params.add(new BasicNameValuePair("password", password));
            if(email.length()>0)
            params.add(new BasicNameValuePair("email",email));




  json  = jsonParser.makeHttpRequest(URL, "POST", params);
            try {
     int id = json.getInt("id");
      String username=json.getString("username");

     SharedPreferences shared=getSharedPreferences("pref",MODE_PRIVATE);
    SharedPreferences.Editor editor=shared.edit();
    editor.putInt("idUser",id);

    editor.putString("username",username);
    editor.commit();


}catch (JSONException e){}
            return json;

        }

        protected void onPostExecute(JSONObject result) {


            try {
                int success=result.getInt("success");

                System.out.println(success);
                 if(success==0){

                     startActivity(getIntent());
                     s.setLoggedin(false);

                     Toast.makeText(getApplicationContext(),result.getString("message"),Toast.LENGTH_LONG).show();

                 }else{
                     startActivity(new Intent(Login.this, Leagues.class));

                     Toast.makeText(getApplicationContext(),result.getString("message"),Toast.LENGTH_LONG).show();
                  }

            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
