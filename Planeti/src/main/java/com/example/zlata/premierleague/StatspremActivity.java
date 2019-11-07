package com.example.zlata.premierleague;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class StatspremActivity extends AppCompatActivity {
    JSONParser jsonParser=new JSONParser();
    ImageView imgteam1;
    DatabaseHandler db;
   public int a=0 ;
    public int b=0;
    public int e=0 ;
    public int f=0;
    Session s;
    Matchtamir m;
    TextView team1stat;
    TextView team2stat;
    Button las;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decision);
        setTitle("");

         team1stat = (TextView) findViewById(R.id.team1stat);
         team2stat = (TextView) findViewById(R.id.team2stat);

        final TextView datelast = (TextView) findViewById(R.id.datelast);
        ImageView img1 = (ImageView) findViewById(R.id.imageteam1);
        ImageView img2 = (ImageView) findViewById(R.id.imageteam2);
        ImageView form = (ImageView) findViewById(R.id.form);
        ImageView standing = (ImageView) findViewById(R.id.standing);
        ImageView htoh = (ImageView) findViewById(R.id.htoh);

       final TextView score1 = (TextView) findViewById(R.id.score);
       final TextView score2 = (TextView) findViewById(R.id.score2);
        final TextView score3 = (TextView) findViewById(R.id.score3);
        final TextView score4 = (TextView) findViewById(R.id.score4);
        final TextView datelast1 = (TextView) findViewById(R.id.datelast1);
        final TextView lastmatchteam1 = (TextView) findViewById(R.id.lastmatchteam11);
        final TextView lastmatchteam12 = (TextView) findViewById(R.id.lastmatchteam12);
        final TextView lastmatchteam13 = (TextView) findViewById(R.id.lastmatchteam13);
        final TextView lastmatchteam14 = (TextView) findViewById(R.id.lastmatchteam14);
        final TextView lastmatchteam15 = (TextView) findViewById(R.id.lastmatchteam15);
        final TextView lastmatchteam2 = (TextView) findViewById(R.id.lastmathteam21);
        final TextView lastmatchteam22 = (TextView) findViewById(R.id.lastmathteam22);
        final TextView lastmatchteam23 = (TextView) findViewById(R.id.lastmathteam23);
        final TextView lastmatchteam24 = (TextView) findViewById(R.id.lastmathteam24);
        final TextView lastmatchteam25 = (TextView) findViewById(R.id.lastmathteam25);
        final Button las = (Button) findViewById(R.id.las);
        final Button dou = (Button) findViewById(R.id.dou);
        final Button xcheyha = (Button) findViewById(R.id.xchayha);
        final Button add = (Button) findViewById(R.id.addmatchesbutton);

        add.setVisibility(View.INVISIBLE);
        if(getIntent().getStringExtra("statteam1").equals("Juventus")) {
            String urimanu = "@drawable/juventus";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Cagliari")) {
            String urimanu = "@drawable/cagliari";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Verona")) {
            String urimanu = "@drawable/hellas";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Napoli")) {
            String urimanu = "@drawable/napoli";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Bologna")) {
            String urimanu = "@drawable/bologna";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Torino")) {
            String urimanu = "@drawable/torino";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Inter")) {
            String urimanu = "@drawable/inter";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Fiorentina")) {
            String urimanu = "@drawable/fiorentina";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Lazio")) {
            String urimanu = "@drawable/lazio";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("SPAL")) {
            String urimanu = "@drawable/spal";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Sampdoria")) {
            String urimanu = "@drawable/sampdoria";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Benevento")) {
            String urimanu = "@drawable/benevento";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Sassuolo")) {
            String urimanu = "@drawable/sassuolo";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Genoa")) {
            String urimanu = "@drawable/genoa";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Udinese")) {
            String urimanu = "@drawable/udinese";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Chievo")) {
            String urimanu = "@drawable/chievo";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Atalanta")) {
            String urimanu = "@drawable/atalanta";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Roma")) {
            String urimanu = "@drawable/roma";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Crotone")) {
            String urimanu = "@drawable/crotone";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Milan")) {
            String urimanu = "@drawable/milan";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

//////////////////
        if(getIntent().getStringExtra("statteam2").equals("Juventus")) {
            String urimanu = "@drawable/juventus";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Cagliari")) {
            String urimanu = "@drawable/cagliari";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Verona")) {
            String urimanu = "@drawable/hellas";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Napoli")) {
            String urimanu = "@drawable/napoli";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Bologna")) {
            String urimanu = "@drawable/bologna";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Torino")) {
            String urimanu = "@drawable/torino";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Inter")) {
            String urimanu = "@drawable/inter";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Fiorentina")) {
            String urimanu = "@drawable/fiorentina";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Lazio")) {
            String urimanu = "@drawable/lazio";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("SPAL")) {
            String urimanu = "@drawable/spal";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Sampdoria")) {
            String urimanu = "@drawable/sampdoria";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Benevento")) {
            String urimanu = "@drawable/benevento";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Sassuolo")) {
            String urimanu = "@drawable/sassuolo";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Genoa")) {
            String urimanu = "@drawable/genoa";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Udinese")) {
            String urimanu = "@drawable/udinese";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Chievo")) {
            String urimanu = "@drawable/chievo";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Atalanta")) {
            String urimanu = "@drawable/atalanta";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Roma")) {
            String urimanu = "@drawable/roma";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Crotone")) {
            String urimanu = "@drawable/crotone";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Milan")) {
            String urimanu = "@drawable/milan";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
////////////////////////////////////////////
        if(getIntent().getStringExtra("statteam1").equals("FC Bayern München")) {
            String urimanu = "@drawable/bayern";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Borussia Dortmund")) {
            String urimanu = "@drawable/dortmund";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Schalke 04")) {
            String urimanu = "@drawable/schalke";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Eintracht Frankfurt")) {
            String urimanu = "@drawable/eintrachtfrankfurt";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Hamburger SV")) {
            String urimanu = "@drawable/hamburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Borussia M'gladbach")) {
            String urimanu = "@drawable/gladbach";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Hannover 96")) {
            String urimanu = "@drawable/hannover";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("VfL Wolfsburg")) {
            String urimanu = "@drawable/wolfsburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("1. FSV Mainz 05")) {
            String urimanu = "@drawable/mainz";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Werder Bremen")) {
            String urimanu = "@drawable/werderbremen";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("1899 Hoffenheim")) {
            String urimanu = "@drawable/hoffeinhaim";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("VfB Stuttgart")) {
            String urimanu = "@drawable/stuttgart";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("FC Augsburg")) {
            String urimanu = "@drawable/augsburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Hertha BSC")) {
            String urimanu = "@drawable/herthaberlin";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("1. FC Köln")) {
            String urimanu = "@drawable/koln";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("SC Freiburg")) {
            String urimanu = "@drawable/freiburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Bayer 04 Leverkusen")) {
            String urimanu = "@drawable/leverkusen";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("RB Leipzig")) {
            String urimanu = "@drawable/leipzig";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        ///////////////////////////////

        if(getIntent().getStringExtra("statteam2").equals("FC Bayern München")) {
            String urimanu = "@drawable/bayern";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Borussia Dortmund")) {
            String urimanu = "@drawable/dortmund";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Schalke 04")) {
            String urimanu = "@drawable/schalke";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Eintracht Frankfurt")) {
            String urimanu = "@drawable/eintrachtfrankfurt";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Hamburger SV")) {
            String urimanu = "@drawable/hamburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Borussia M'gladbach")) {
            String urimanu = "@drawable/gladbach";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Hannover 96")) {
            String urimanu = "@drawable/hannover";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("VfL Wolfsburg")) {
            String urimanu = "@drawable/wolfsburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("1. FSV Mainz 05")) {
            String urimanu = "@drawable/mainz";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Werder Bremen")) {
            String urimanu = "@drawable/werderbremen";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("1899 Hoffenheim")) {
            String urimanu = "@drawable/hoffeinheim";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("VfB Stuttgart")) {
            String urimanu = "@drawable/stuttgart";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("FC Augsburg")) {
            String urimanu = "@drawable/augsburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Hertha BSC")) {
            String urimanu = "@drawable/herthaberlin";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("2. FC Köln")) {
            String urimanu = "@drawable/koln";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("SC Freiburg")) {
            String urimanu = "@drawable/freiburg";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Bayer 04 Leverkusen")) {
            String urimanu = "@drawable/leverkusen";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("RB Leipzig")) {
            String urimanu = "@drawable/leipzig";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

////////////////////////////////////////////////

        if(getIntent().getStringExtra("statteam1").equals("Athletic")) {
            String urimanu = "@drawable/bilbao";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Getafe")) {
            String urimanu = "@drawable/getafe";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Barcelona")) {
            String urimanu = "@drawable/barca";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Betis")) {
            String urimanu = "@drawable/betis";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Celta")) {
            String urimanu = "@drawable/celta";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("R. Sociedad")) {
            String urimanu = "@drawable/sociedad";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Club Deportivo Leganés")) {
            String urimanu = "@drawable/leganes";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Deportivo")) {
            String urimanu = "@drawable/deportivo";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("R. Madrid")) {
            String urimanu = "@drawable/realmadrid";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Girona")) {
            String urimanu = "@drawable/girona";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Atlético")) {
            String urimanu = "@drawable/atletico";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Club Deportivo Leganés")) {
            String urimanu = "@drawable/leganes";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Alavés")) {
            String urimanu = "@drawable/alaves";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Levante")) {
            String urimanu = "@drawable/levante";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Málaga")) {
            String urimanu = "@drawable/malaga";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Eibar")) {
            String urimanu = "@drawable/eibar";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Espanyol")) {
            String urimanu = "@drawable/espanyol";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Valencia")) {
            String urimanu = "@drawable/valencia";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Las Palmas")) {
            String urimanu = "@drawable/laspalmas";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Villarreal CF")) {
            String urimanu = "@drawable/villareal";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Girona")) {
            String urimanu = "@drawable/girona";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Sevilla")) {
            String urimanu = "@drawable/sevilla";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        ///////////////////////////////

        if(getIntent().getStringExtra("statteam2").equals("Athletic")) {
            String urimanu = "@drawable/bilbao";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Getafe")) {
            String urimanu = "@drawable/getafe";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Barcelona")) {
            String urimanu = "@drawable/barca";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Betis")) {
            String urimanu = "@drawable/betis";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Celta")) {
            String urimanu = "@drawable/celta";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("R. Sociedad")) {
            String urimanu = "@drawable/sociedad";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Club Deportivo Leganés")) {
            String urimanu = "@drawable/leganes";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Deportivo")) {
            String urimanu = "@drawable/deportivo";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("R. Madrid")) {
            String urimanu = "@drawable/realmadrid";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Girona")) {
            String urimanu = "@drawable/girona";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Atlético")) {
            String urimanu = "@drawable/atletico";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Club Deportivo Leganés")) {
            String urimanu = "@drawable/leganes";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Alavés")) {
            String urimanu = "@drawable/alaves";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Levante")) {
            String urimanu = "@drawable/levante";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Málaga")) {
            String urimanu = "@drawable/malaga";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Eibar")) {
            String urimanu = "@drawable/eibar";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Espanyol")) {
            String urimanu = "@drawable/espanyol";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Valencia")) {
            String urimanu = "@drawable/valencia";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Las Palmas")) {
            String urimanu = "@drawable/laspalmas";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Villarreal CF")) {
            String urimanu = "@drawable/villareal";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Girona")) {
            String urimanu = "@drawable/girona";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Sevilla")) {
            String urimanu = "@drawable/sevilla";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }




///////////////////////////////////////////////
        if(getIntent().getStringExtra("statteam1").equals("Manchester United")) {
            String urimanu = "@drawable/maan";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }


        if(getIntent().getStringExtra("statteam1").equals("Chelsea")) {
            String urimanu = "@drawable/chelseaabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }


        if(getIntent().getStringExtra("statteam1").equals("Bournemouth")) {
            String urimanu = "@drawable/bounmouthabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Burnley")) {
            String urimanu = "@drawable/burnleyabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Manchester City")) {
            String urimanu = "@drawable/cityabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Crystal Palace")) {
            String urimanu = "@drawable/crystalabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Arsenal")) {
            String urimanu = "@drawable/arsenalabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Leicester City")) {
            String urimanu = "@drawable/leicesterabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Liverpool")) {
            String urimanu = "@drawable/liverabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Southampton")) {
            String urimanu = "@drawable/southamptonabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Tottenham Hotspur")) {
            String urimanu = "@drawable/spursabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Stoke City")) {
            String urimanu = "@drawable/stockabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Swansea")) {
            String urimanu = "@drawable/swanseyabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Everton")) {
            String urimanu = "@drawable/evertonabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam1").equals("Watford")) {
            String urimanu = "@drawable/watfordabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("West Bromwich Albion")) {
            String urimanu = "@drawable/westbromabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("West Ham United")) {
            String urimanu = "@drawable/westhamabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Newcastle United")) {
            String urimanu = "@drawable/newcastleabdpng";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Huddersfield Town")) {
            String urimanu = "@drawable/huddersfiledabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam1").equals("Brighton & Hove Albion")) {

            team1stat.setText("Brighton");
            String urimanu = "@drawable/brightonabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img1.setImageDrawable(res);
        }
      //  img2.setImageDrawable(res);


        //-------------------------------------------------------------------------------------------------------------------------//


        if(getIntent().getStringExtra("statteam2").equals("Manchester United")) {
            String urimanu = "@drawable/maan";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }


        if(getIntent().getStringExtra("statteam2").equals("Chelsea")) {
            String urimanu = "@drawable/chelseaabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }


        if(getIntent().getStringExtra("statteam2").equals("Bournemouth")) {
            String urimanu = "@drawable/bounmouthabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Burnley")) {
            String urimanu = "@drawable/burnleyabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Manchester City")) {
            String urimanu = "@drawable/cityabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Crystal Palace")) {
            String urimanu = "@drawable/crystalabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Arsenal")) {
            String urimanu = "@drawable/arsenalabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Leicester City")) {
            String urimanu = "@drawable/leicesterabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Liverpool")) {
            String urimanu = "@drawable/liverabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Southampton")) {
            String urimanu = "@drawable/southamptonabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Tottenham Hotspur")) {
            String urimanu = "@drawable/spursabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Stoke City")) {
            String urimanu = "@drawable/stockabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Swansea")) {
            String urimanu = "@drawable/swanseyabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Everton")) {
            String urimanu = "@drawable/evertonabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Watford")) {
            String urimanu = "@drawable/watfordabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("West Bromwich Albion")) {
            String urimanu = "@drawable/westbromabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("West Ham United")) {
            String urimanu = "@drawable/westhamabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        if(getIntent().getStringExtra("statteam2").equals("Newcastle United")) {
            String urimanu = "@drawable/newcastleabdpng";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Huddersfield Town")) {
            String urimanu = "@drawable/huddersfiledabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }
        if(getIntent().getStringExtra("statteam2").equals("Brighton & Hove Albion")) {
            String urimanu = "@drawable/brightonabd";  // where myresource (without the extension) is the file

            int imageResourcemanu = getResources().getIdentifier(urimanu, null, getPackageName());


            Drawable res = getResources().getDrawable(imageResourcemanu);
            img2.setImageDrawable(res);
        }

        team1stat.setText(getIntent().getStringExtra("statteam1"));
        team2stat.setText(getIntent().getStringExtra("statteam2"));










        m=new Matchtamir();
        m.setTeamlawal(team1stat.getText().toString());
        m.setTeamtheni(team2stat.getText().toString());
        m.setTaamira("");


       las.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               add.setVisibility(View.VISIBLE);

               m.setTaamira(m.getTaamira()+"1");
               Toast.makeText(getApplicationContext(), "Home Team will win", Toast.LENGTH_LONG).show();
               las.setEnabled(false);


               // myIntent.putExtra("t",t.toString());
               // myIntent.putExtra("t",t);



           }
       });

        xcheyha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                add.setVisibility(View.VISIBLE);


                m.setTaamira(m.getTaamira()+"x");
                Toast.makeText(getApplicationContext(), "Draw", Toast.LENGTH_LONG).show();
                xcheyha.setEnabled(false);
                // myIntent.putExtra("t",t.toString());
                // myIntent.putExtra("t",t);



            }
        });

        dou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                add.setVisibility(View.VISIBLE);

                m.setTaamira(m.getTaamira()+"2");
                Toast.makeText(getApplicationContext(), "Away Team will win", Toast.LENGTH_LONG).show();
                dou.setEnabled(false);


                // myIntent.putExtra("t",t.toString());
                // myIntent.putExtra("t",t);



            }
        });



        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),FormActivity.class);
                myIntent.putExtra("statteam1",team1stat.getText().toString());
                myIntent.putExtra("statteam2",team2stat.getText().toString());


                // myIntent.putExtra("t",t.toString());
                // myIntent.putExtra("t",t);

                startActivity(myIntent);



            }

        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder2=new AlertDialog.Builder(StatspremActivity.this);
                builder2.setMessage("Do you want to add this match?");
                builder2.setPositiveButton("OK",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        AttemptTest attempttest= new AttemptTest();
                        attempttest.execute(m.getTeamlawal(),m.getTeamtheni(),m.getTaamira());
                        dou.setEnabled(false);

                    }

                }).setNegativeButton("Cancel",null);
                AlertDialog alert=builder2.create();
                alert.show();



            }

        });

        htoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),headtoheadActivity.class);
                myIntent.putExtra("statteam1",team1stat.getText().toString());
                myIntent.putExtra("statteam2",team2stat.getText().toString());


                // myIntent.putExtra("t",t.toString());
                // myIntent.putExtra("t",t);

                startActivity(myIntent);



            }

        });

        standing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),standingActivity.class);
                myIntent.putExtra("statteam1",team1stat.getText().toString());
                myIntent.putExtra("statteam2",team2stat.getText().toString());


                // myIntent.putExtra("t",t.toString());
                // myIntent.putExtra("t",t);

                startActivity(myIntent);



            }

        });


    }

    private class AttemptTest extends AsyncTask<String, String, JSONObject> {

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

        }

        @Override

        protected JSONObject doInBackground(String... args) {



            String equipe1 = args[0];
            String equipe2 = args[1];
            String choix = args[2];


            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("equipe1", equipe1));
            params.add(new BasicNameValuePair("equipe2", equipe2));
            params.add(new BasicNameValuePair("choix", choix));



            SharedPreferences shared=getSharedPreferences("pref",MODE_PRIVATE);
            int id= shared.getInt("idUser",0);

            String URL= "http://172.16.158.131/index3.php?id="+id;
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
                startActivity(new Intent(StatspremActivity.this,  Coupon.class));
                finish();
                return true;
            case R.id.logout:
                s= new Session(this);
                s.setLoggedin(false);
                startActivity(new Intent(StatspremActivity.this,  Login.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}




