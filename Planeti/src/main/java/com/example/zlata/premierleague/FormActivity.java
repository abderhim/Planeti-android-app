package com.example.zlata.premierleague;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
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

public class FormActivity extends AppCompatActivity {

    TextView team1stat;
    TextView team2stat;
Session s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
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
        setTitle("FORM");

        ImageView img1 = (ImageView) findViewById(R.id.imageteam1);
        ImageView img2 = (ImageView) findViewById(R.id.imageteam2);
        team1stat = (TextView) findViewById(R.id.team1stat);
        team2stat = (TextView) findViewById(R.id.team2stat);

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


        StringRequest stringRequest = new StringRequest(Request.Method.GET, "https://www.jasonbase.com/things/x3pa.json",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);

                        try {

                            JSONObject prem = new JSONObject(response);
                            JSONArray results =prem.getJSONArray("results");



                            // ArrayList<Match> listE = new ArrayList<>();



                            for (int i=0; i<results.length();i++){
                                JSONObject obj = results.getJSONObject(i);


                                // JSONObject matchday = obj.getJSONObject("name");


                                if ( obj.getString("name").equals((getIntent().getStringExtra("statteam1")))) {
                                    lastmatchteam1.setText(obj.getString("score1"));
                                    if (lastmatchteam1.getText().equals("win")) {
                                        lastmatchteam1.setText("W");
                                        lastmatchteam1.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam1.getText().equals("draw")) {
                                        lastmatchteam1.setText("D");
                                        lastmatchteam1.setBackgroundResource(R.color.yellow);

                                    }
                                    if (lastmatchteam1.getText().equals("lost")) {
                                        lastmatchteam1.setText("L");
                                        lastmatchteam1.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam12.setText(obj.getString("score2"));
                                    if (lastmatchteam12.getText().equals("win")) {
                                        lastmatchteam12.setText("W");
                                        lastmatchteam12.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam12.getText().equals("draw")) {
                                        lastmatchteam12.setText("D");
                                        lastmatchteam12.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam12.getText().equals("lost")) {
                                        lastmatchteam12.setText("L");
                                        lastmatchteam12.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam13.setText(obj.getString("score3"));
                                    if (lastmatchteam13.getText().equals("win")) {
                                        lastmatchteam13.setText("W");
                                        lastmatchteam13.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam13.getText().equals("draw")) {
                                        lastmatchteam13.setText("D");
                                        lastmatchteam13.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam13.getText().equals("lost")) {
                                        lastmatchteam13.setText("L");
                                        lastmatchteam13.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam14.setText(obj.getString("score4"));
                                    if (lastmatchteam14.getText().equals("win")) {
                                        lastmatchteam14.setText("W");
                                        lastmatchteam14.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam14.getText().equals("draw")) {
                                        lastmatchteam14.setText("D");
                                        lastmatchteam14.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam14.getText().equals("lost")) {
                                        lastmatchteam14.setText("L");
                                        lastmatchteam14.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam15.setText(obj.getString("score5"));
                                    if (lastmatchteam15.getText().equals("win")) {
                                        lastmatchteam15.setText("W");
                                        lastmatchteam15.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam15.getText().equals("draw")) {
                                        lastmatchteam15.setText("D");
                                        lastmatchteam15.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam15.getText().equals("lost")) {
                                        lastmatchteam15.setText("L");
                                        lastmatchteam15.setBackgroundResource(R.color.red);

                                    }



                                }


                                /////////////////////////////////

                                if ( obj.getString("name").equals((getIntent().getStringExtra("statteam2")))) {
                                    lastmatchteam2.setText(obj.getString("score1"));
                                    if (lastmatchteam2.getText().equals("win")) {
                                        lastmatchteam2.setText("W");
                                        lastmatchteam2.setBackgroundResource(R.color.green);


                                    }
                                    if (lastmatchteam2.getText().equals("draw")) {
                                        lastmatchteam2.setText("D");
                                        lastmatchteam2.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam2.getText().equals("lost")) {
                                        lastmatchteam2.setText("L");
                                        lastmatchteam2.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam22.setText(obj.getString("score2"));
                                    if (lastmatchteam22.getText().equals("win")) {
                                        lastmatchteam22.setText("W");
                                        lastmatchteam22.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam22.getText().equals("draw")) {
                                        lastmatchteam22.setText("D");
                                        lastmatchteam22.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam22.getText().equals("lost")) {
                                        lastmatchteam22.setText("L");
                                        lastmatchteam22.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam23.setText(obj.getString("score3"));
                                    if (lastmatchteam23.getText().equals("win")) {
                                        lastmatchteam23.setText("W");
                                        lastmatchteam23.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam23.getText().equals("draw")) {
                                        lastmatchteam23.setText("D");
                                        lastmatchteam23.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam23.getText().equals("lost")) {
                                        lastmatchteam23.setText("L");
                                        lastmatchteam23.setBackgroundResource(R.color.red);
                                    }

                                    lastmatchteam24.setText(obj.getString("score4"));
                                    if (lastmatchteam24.getText().equals("win")) {
                                        lastmatchteam24.setText("W");
                                        lastmatchteam24.setBackgroundResource(R.color.green);
                                       ;
                                    }
                                    if (lastmatchteam24.getText().equals("draw")) {
                                        lastmatchteam24.setText("D");
                                        lastmatchteam24.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam24.getText().equals("lost")) {
                                        lastmatchteam24.setText("L");
                                        lastmatchteam24.setBackgroundResource(R.color.red);

                                    }

                                    lastmatchteam25.setText(obj.getString("score5"));
                                    if (lastmatchteam25.getText().equals("win")) {
                                        lastmatchteam25.setText("W");
                                        lastmatchteam25.setBackgroundResource(R.color.green);

                                    }
                                    if (lastmatchteam25.getText().equals("draw")) {
                                        lastmatchteam25.setText("D");
                                        lastmatchteam25.setBackgroundResource(R.color.yellow);
                                    }
                                    if (lastmatchteam25.getText().equals("lost")) {
                                        lastmatchteam25.setText("L");
                                        lastmatchteam25.setBackgroundResource(R.color.red);

                                    }





                                }






















                            }

                            //   System.out.println(listE.toString());







                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("That didn't work!"+error);
            }
        });

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(stringRequest);










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
                startActivity(new Intent(FormActivity.this,  Coupon.class));
                finish();
                return true;
            case R.id.logout:
                s= new Session(this);
                s.setLoggedin(false);
                startActivity(new Intent(FormActivity.this,  Login.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
