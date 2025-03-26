package com.example.resturat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OrderDBA extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="FS3.db";
    public static final String TABLE_NAME="OrderItem";
    public static final String COL_1="DATE";
    public static final String COL_2="ORDER_NO";
    public static final String COL_3="NAME";
    public static final String COL_4="ADDRESS";
    public static final String COL_5="MOBILE_NO";
    public static final String COL_6="ITEM_LIST";
    public static final String COL_7="PRICE";

    public OrderDBA(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE "+TABLE_NAME +"(DATE TEXT,ORDER_NO TEXT UNIQUE,NAME TEXT,ADDRESS TEXT,MOBILE_NO TEXT,ITEM_LIST TEXT,PRICE TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData2(String dt,String od,String name,String add,String no,String li,String pr)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_1,dt);
        contentValues.put(COL_2,od);
        contentValues.put(COL_3,name);
        contentValues.put(COL_4,add);
        contentValues.put(COL_5,no);
        contentValues.put(COL_6,li);
        contentValues.put(COL_7,pr);

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
        public Cursor getOrder()
        {
            SQLiteDatabase db=getWritableDatabase();
            String res="SELECT * FROM "+TABLE_NAME;
            Cursor cursor=db.rawQuery(res,null);
            return cursor;
        }
    protected Cursor getData2(String id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String res="SELECT * FROM "+TABLE_NAME+" WHERE ORDER_NO='"+id+"'";
        Cursor cursor=db.rawQuery(res,null);
        return cursor;
    }
}
