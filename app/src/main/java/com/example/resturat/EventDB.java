package com.example.resturat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EventDB extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="FS2.db";
    public static final String TABLE_NAME="Event_table";
    public static final String COL_1="NAME";
    public static final String COL_2="MOBILE";
    public static final String COL_3="EMAIL";
    public static final String COL_4="DATEBK";
    public static final String COL_5="NOPERS";
    public static final String COL_6="TYP";


    public EventDB(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE "+TABLE_NAME +"(NAME TEXT,MOBILE TEXT,EMAIL TEXT,DATEBK TEXT,NOPERS TEXT,TYP TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertEVENT(String name,String no,String email,String dt,String np,String tp)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,name);
        contentValues.put(COL_2,no);
        contentValues.put(COL_3,email);
        contentValues.put(COL_4,dt);
        contentValues.put(COL_5,np);
        contentValues.put(COL_6,tp);
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
    public Cursor getEvent()
    {
        String a="sat";
       SQLiteDatabase db=this.getWritableDatabase();
       String res="SELECT * FROM "+TABLE_NAME ;
        Cursor cursor=db.rawQuery(res,null);
        return cursor;
        //return db.rawQuery("SELECT * FROM Event_table", null);
    }


}
