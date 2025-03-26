package com.example.resturat;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ViewList extends Fragment {

    public static EditText vd1;
    public static Button vd2,cancelitem;
    public static TextView vd3;
    public static OrderDBA mudb4;
    public static String uid2,pwd2,name;
    public Cursor res;
    public ViewList() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_view_list, container, false);
        mudb4=new OrderDBA(getContext());
        vd1=(EditText)view.findViewById(R.id.viewed1);
        vd2=(Button)view.findViewById(R.id.viewbtn1);
        vd3=(TextView) view.findViewById(R.id.viewtxt1);
        cancelitem=(Button)view.findViewById(R.id.cancel);
        cancelitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=vd1.getText().toString();
                //int res=mudb4.deleteData(id);
                Toast.makeText(getContext(),"Your Order Cancel Successfully",Toast.LENGTH_SHORT).show();
                vd3.setText("");
            }
        });
        vd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = vd1.getText().toString();


                res = mudb4.getData2(name);
                /*uid2 = null;
                pwd2 = null;
                if (res.moveToFirst()) {
                    uid2 = res.getString(5);
                    pwd2 = res.getString(6);
                }
                else
                {
                    Toast.makeText(getContext(),"not found",Toast.LENGTH_SHORT);
                }*/
                // vd3.setText("\n Items ="+uid2+"\n Price = "+pwd2);
                //vd3.setText(res.toString());
                Toast.makeText(getContext(), "hhhb" + res, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}