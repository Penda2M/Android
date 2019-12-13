package com.example.android.fragmentexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class StudentDatabaseHelper extends SQLiteOpenHelper {

    private static final String  DATABASENAME = "student1.db";
    private static final int DATABASEVERSION = 1;


    public StudentDatabaseHelper(Context context){
        super(context, "DATABASENAME", null, Integer.parseInt("DATABASEVERSION"));
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE table student(id int PRIMARY KEY AUTOINCREMENT, name TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onOpen(SQLiteDatabase db){
        super.onOpen(db);
    }
}
