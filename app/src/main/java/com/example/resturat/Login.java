package com.example.resturat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
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

public class Login extends AppCompatActivity {

    DBHelper mydb;
    EditText loged11,loged21;
    Button logbtn11;
    String txtUid1, txtPwd1, uid1, pwd1;
    TextView logbtn21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        mydb=new DBHelper(this);
        loged11=(EditText)findViewById(R.id.aj_log_ed1);
        loged21=(EditText)findViewById(R.id.aj_log_ed2);
        logbtn11=(Button)findViewById(R.id.aj_log_bt1);
        logbtn21=(TextView)findViewById(R.id.textView5);
        logbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginMe1();
            }
        });
        logbtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginBack1();
            }
        });

    }
    private void LoginMe1() {
        String name = loged11.getText().toString();
        String pwd1 = loged21.getText().toString();

        Cursor res = mydb.getData1(name);
        uid1 = null;
        pwd1 = null;
        if (res.moveToFirst()) {
            uid1 = res.getString(0);
            pwd1 = res.getString(3);
        }
        if(TextUtils.isEmpty(name) && TextUtils.isEmpty(pwd1))
        {
            loged11.setError("Username and Password are not empty");
        }
        else if (name.equals("admin") && name.equals("admin"))
        {
            Intent i = new Intent(this, MainAdmin.class);
            startActivity(i);

        }
        else if (name.equals(uid1) && pwd1.equals(pwd1)) {
            Intent i = new Intent(this, FoodStudio.class);
           startActivity(i);

        } else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
            //t1.setText(uid+ " "+pwd);
        }
    }
    private void LoginBack1()
    {
        Intent i = new Intent(this, Registration.class);
        startActivity(i);

    }
}