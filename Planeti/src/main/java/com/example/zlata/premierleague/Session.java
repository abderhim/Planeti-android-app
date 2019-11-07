package com.example.zlata.premierleague;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zlata on 17/10/2017.
 */

public class Session {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context ctx;

    public Session(Context ctx){


        this.ctx =ctx;
        prefs=ctx.getSharedPreferences("contacts",Context.MODE_PRIVATE);
        editor =prefs.edit();


    }

    public void setLoggedin(boolean loggedin){


        editor.putBoolean("loggedInmode",loggedin);
        editor.commit();


    }

    public Boolean loggedin(){


        return prefs.getBoolean("loggedInmode",false);
    }
}
