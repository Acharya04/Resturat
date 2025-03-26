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

public class CPBooking extends Fragment {

    Button btn1;
    public EventDB mdb1;
    public EditText nm1,mb1,eml1,np1;
    DatePicker dt1;

    public CPBooking() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_c_p_booking, container, false);
        btn1=(Button)view.findViewById(R.id.sub1);
        mdb1=new EventDB(getContext());
        nm1=(EditText) view.findViewById(R.id.txtnme1);
        mb1=(EditText) view.findViewById(R.id.txtmbe1);
        eml1=(EditText) view.findViewById(R.id.txtemaile1);
        dt1=(DatePicker) view.findViewById(R.id.txtdte1);
        np1=(EditText) view.findViewById(R.id.txtnpe1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm2 = nm1.getText().toString();
                String mob2 = mb1.getText().toString();
                String em2 = eml1.getText().toString();
                String dtn2 = dt1.getDayOfMonth()+"/"+dt1.getMonth()+"/"+dt1.getYear();
                String nps2 = np1.getText().toString();
                boolean res = mdb1.insertEVENT(nm2, mob2, em2, dtn2, nps2, "Corporate Party");
                if (res == true) {
                    eventbk fragment3 = new eventbk();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.content1, fragment3);
                    fragmentTransaction.commit();
                } else {
                    Toast.makeText(getContext(), " not inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}