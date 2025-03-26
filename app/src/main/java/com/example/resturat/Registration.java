package com.example.resturat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration extends AppCompatActivity {
    DBHelper myDb;
    EditText txtname1,txtemail1,txtmob1,txtpwd1;
    Button btn1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        myDb=new DBHelper(this);
        txtname1=(EditText)findViewById(R.id.aj_usernm);
        txtemail1=(EditText)findViewById(R.id.aj_email);
        txtmob1=(EditText)findViewById(R.id.aj_mob);
        txtpwd1=(EditText)findViewById(R.id.aj_pwd);
        btn1=(Button)findViewById(R.id.aj_log);
        txt1=(TextView)findViewById(R.id.aj_txt);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickReg1();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickMe1();
            }
        });
           }
    private void ClickMe1()
    {
        String nm=txtname1.getText().toString();
        String em=txtemail1.getText().toString();
        String mob=txtmob1.getText().toString();
        String pd=txtpwd1.getText().toString();
        Boolean res=myDb.insertData1(nm,em,mob,pd);
        if (res==true)
        {
            Toast.makeText(this,"inserted",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,Login.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this," not inserted",Toast.LENGTH_SHORT).show();
        }
    }
    private void ClickReg1()
    {
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
}