package com.example.resturat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="FS.db";
    public static final String TABLE_NAME="Studio_table";
    public static final String COL_1="NAME";
    public static final String COL_2="EMAIL";
    public static final String COL_3="MOBILE";
    public static final String COL_4="PASSWORD";


    public DBHelper(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE "+TABLE_NAME +"(NAME TEXT UNIQUE,EMAIL TEXT,MOBILE TEXT,PASSWORD TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData1(String name,String email,String no,String pwd)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,name);
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,no);
        contentValues.put(COL_4,pwd);
        long result =db.insert(TABLE_NAME,null,contentValues);
        db.close();
        if (result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public Cursor getData1(String id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String res="SELECT * FROM "+TABLE_NAME+" WHERE NAME='"+id+"'";
        Cursor cursor=db.rawQuery(res,null);
        return cursor;
    }

}
