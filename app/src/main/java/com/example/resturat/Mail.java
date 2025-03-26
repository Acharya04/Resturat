package com.example.resturat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mail extends Fragment {
    EditText ed1,ed2,ed3;
    Button btn;
    String nm,mb,msg,fmsg;
    public Mail() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mail, container, false);
        ed1=(EditText)view.findViewById(R.id.txtkonu);
        ed2=(EditText)view.findViewById(R.id.txtkime);
        ed3=(EditText)view.findViewById(R.id.txtmsg);
        btn=(Button)view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });
        return view;
    }
    protected void sendEmail()
    {
        nm=ed1.getText().toString();
        mb=ed2.getText().toString();
        msg=ed3.getText().toString();
        fmsg="Name : "+nm+"\n Mobile Number : "+mb+"\n Message : "+msg;
        Log.i("Send email","");
        String[] To={"archcomer@gmail.com"};
        Intent emailIntent=new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,To);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,"FEEDBACK");
        emailIntent.putExtra(Intent.EXTRA_TEXT,fmsg);
        try
        {
            startActivity(Intent.createChooser(emailIntent,"Send email....."));
            Log.i("Finished","");
        }
        catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(getContext(),"Unable to send",Toast.LENGTH_SHORT).show();
        }
    }
}