package com.example.resturat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Order_Confirm extends Fragment {
    TextView msg;
    public Order_Confirm() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_order__confirm, container, false);
        msg=(TextView)view.findViewById(R.id.confirm);
        String value=getArguments().getString("orderno");
        msg.setText("Your order is successfully placed and your order number is : "+value);
        return view;
    }
}