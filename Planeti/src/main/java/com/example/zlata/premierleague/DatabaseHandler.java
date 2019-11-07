package com.example.zlata.premierleague;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by zlata on 17/10/2017.
 */

public  class DatabaseHandler extends SQLiteOpenHelper {


    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Planeti";

    // Contacts table name
    private static final String TABLE_matchouet = "matchouwetna";
    private static final String TABLE_Users = "users";
    private static final String KEY_ID = "id";
    private static final String KEY_matchlouwel = "name";
    private static final String KEY_matchtheni = "phone_number";
    private static final String KEY_taamira = "username";
    private static final String KEY_password = "password";

Context context;
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME , null, DATABASE_VERSION);
        this.context=context;
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_matchouet + "(" + KEY_matchlouwel + " TEXT,"
                + KEY_matchtheni + " TEXT,"
                + KEY_taamira + " TEXT" + ")";


        db.execSQL(CREATE_CONTACTS_TABLE);

    }


    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_matchouet);


        // Create tables again
        onCreate(db);
    }

    void addmatch(Matchtamir contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_matchlouwel, contact.getTeamlawal()); // Contact Name
        values.put(KEY_matchtheni, contact.getTeamtheni());
        values.put(KEY_taamira, contact.getTaamira());// Contact Phone

        // Inserting Row
        db.insert(TABLE_matchouet, null, values);

        db.close(); // Closing database connection

        Toast.makeText(context,"Match Added",Toast.LENGTH_LONG).show();
    }






    public ArrayList<Matchtamir> getAllmatches() {
        ArrayList<Matchtamir> contactList = new ArrayList<Matchtamir>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_matchouet;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Matchtamir contact = new Matchtamir();
                ;
                contact.setTeamlawal(cursor.getString(0));
                contact.setTeamtheni(cursor.getString(1));
                contact.setTaamira(cursor.getString(2));
                // Adding contact to list
                contactList.add(contact);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }

    void delete()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_matchouet,null,null);


    }


}
