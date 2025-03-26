package com.example.resturat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class AdminEvent extends AppCompatActivity {
    private GridView gridView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;
    EventDB dbevent;
    Button bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_event);
        gridView=(GridView) findViewById(R.id.gridView1);
        bk=(Button)findViewById(R.id.eventback);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainAdmin.class);
                startActivity(i);
            }
        });
        //ArrayList
        list=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,list);
        String name, mob,email,dtn,npr,fp;
        name="";
        mob="";
        email="";
        dtn="";
        npr="";
        fp="";
        dbevent=new EventDB(getBaseContext());
        try
        {
            //for holding retrieve data from query and store in the form of rows
            Cursor c=dbevent.getEvent();
            //Move the cursor to the first row.
            if(c.moveToFirst())
            {
                do
                {
                    name=c.getString(0);
                    mob=c.getString(1);
                    //email=c.getString(2);
                    dtn=c.getString(3);
                    //  npr=c.getString(4);
                    //  fp=c.getString(5);
                    //add in to array list
                    list.add(name);
                    list.add(mob);
                    // list.add(email);
                    list.add(dtn);
                    //list.add(npr);
                    //list.add(fp);
                    gridView.setAdapter(adapter);
                }while(c.moveToNext());//Move the cursor to the next row.
            }
            else
            {
                Toast.makeText(getApplicationContext(), "No data found", Toast.LENGTH_LONG).show();
            }
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(), "No data found"+e.getMessage(), Toast.LENGTH_LONG).show();
        }
        dbevent.close();

    }
}