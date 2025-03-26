package com.example.resturat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class BPBooking extends Fragment {

    public EventDB mdb;
    public EditText nm,mb,eml,np;
    DatePicker dt;
    Button bt;
    public BPBooking() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mdb=new EventDB(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b_p_booking, container, false);

        bt=(Button)view.findViewById(R.id.sub);
        nm=(EditText) view.findViewById(R.id.txtnme);
        mb=(EditText) view.findViewById(R.id.txtmbe);
        eml=(EditText) view.findViewById(R.id.txtemaile);
        dt=(DatePicker) view.findViewById(R.id.txtdte);
        np=(EditText) view.findViewById(R.id.txtnpe);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Clickevent();

            }
        });
        return view;
    }
    public void Clickevent()
    {
        String nm1=nm.getText().toString();
        String mob=mb.getText().toString();
        String em=eml.getText().toString();
        String dtn=dt.getDayOfMonth()+"/"+dt.getMonth()+"/"+dt.getYear();
        String nps=np.getText().toString();
        boolean res=mdb.insertEVENT(nm1,mob,em,dtn,nps,"Birthday Party");

        if (res==true)
        {
            eventbk fragment3 = new eventbk();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content1, fragment3);
            fragmentTransaction.commit();
        }
        else
        {
            Toast.makeText(getContext()," not inserted",Toast.LENGTH_SHORT).show();
        }

    }
}