package com.example.resturat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
public class Event extends Fragment {

    Button bt,bt1;
    Fragment fragment=null;
    FragmentManager fragmentManager=null;
    public Event() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_event, container, false);
        bt=(Button)view.findViewById(R.id.bpbooking);
        bt1=(Button)view.findViewById(R.id.cpbooking);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BPBooking fragment2 = new BPBooking();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content1, fragment2);
                fragmentTransaction.commit();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CPBooking fragment3 = new CPBooking();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content1, fragment3);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}