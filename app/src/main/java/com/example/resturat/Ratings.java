package com.example.resturat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Ratings extends Fragment {

    Button btn;
    RatingBar rtb;
    public Ratings() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_ratings, container, false);
        btn=(Button) view.findViewById(R.id.btn1);
        rtb=(RatingBar) view.findViewById(R.id.smilerating);
        return view;
    }
    public void onBtnClick(View v)
    {
        float value=rtb.getRating();
        Toast.makeText(getContext(),"Rating is : "+value,Toast.LENGTH_SHORT).show();
    }
}