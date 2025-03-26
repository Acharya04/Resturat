package com.example.resturat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Create_List extends Fragment {

    TextView txtcart,txtcartprice,txtdt,txttot;
    EditText edsave,ednm,edadd,edmb;
    Button btssave;
    OrderDBA mydb3;
    String value1,order,value,value2;
    Boolean res;

    public Create_List() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_create__list, container, false);
        txtdt=(TextView)view.findViewById(R.id.dt);
        txtdt.setText("Date : "+new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()));
        ednm=(EditText)view.findViewById(R.id.ordernm);
        edadd=(EditText)view.findViewById(R.id.orderadd);
        edmb=(EditText)view.findViewById(R.id.ordermob);
        txtcart=(TextView)view.findViewById(R.id.carttxt1);
        txtcartprice=(TextView)view.findViewById(R.id.carttxt2);
        txttot=(TextView)view.findViewById(R.id.carttot);
        mydb3=new OrderDBA(getContext());
        btssave=(Button)view.findViewById(R.id.btnorder);
        value=getArguments().getString("pname");
        value1=getArguments().getString("pprice");
        value2=getArguments().getString("fprice");
        //int tot=Integer.parseInt(value1)+35;
        txtcart.setText(value);
        txtcartprice.setText(value1);
        txttot.setText("Total Price : "+value2);
        btssave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClickSV();
            }

        });

        return view;
    }

    public void ClickSV() {
        Random random=new Random();
        int r=random.nextInt(2000000);
        order=String.valueOf(r);
        String dt=txtdt.getText().toString();
        String od=order;
        String nm=ednm.getText().toString();
        String add=edadd.getText().toString();
        String mb=edmb.getText().toString();
        String em=txtcart.getText().toString();
        String mob=txttot.getText().toString();

        res=mydb3.insertData2(dt,od,nm,add,mb,em,mob);
        if (res = true)
        {
            // Toast.makeText(getContext(),"Order Placed Successfully",Toast.LENGTH_SHORT).show();
            Order_Confirm cl=new Order_Confirm();
            Bundle args=new Bundle();

            args.putString("orderno",order);

            cl.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.content1,cl).commit();

        }
        else
        {
            Toast.makeText(getContext(),"Due to some technical error,your order is not confirm.check after some times",Toast.LENGTH_SHORT).show();
        }
    }
}