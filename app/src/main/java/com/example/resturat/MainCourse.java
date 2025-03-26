package com.example.resturat;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainCourse extends Fragment {

    TabHost host;
    Button b1,b2,bcart,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b31,b32,b33,b34,b35,b36;
    Button b41,b42,b43,b44,b51,b52,b53;
    String cartname="";
    int cartprice;
    Fragment fragment=null;
    FragmentManager fragmentManager=null;
    TextView t1;

    public MainCourse() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_main_course, container, false);
        host=(TabHost)view.findViewById(R.id.tabHost);
        host.setup();

        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("All");
        host.addTab(spec);


        spec =host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Starters");
        host.addTab(spec);

        spec =host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Soup");
        host.addTab(spec);

        spec =host.newTabSpec("Tab Four");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Main Course");
        host.addTab(spec);


        spec =host.newTabSpec("Tab Five");
        spec.setContent(R.id.tab5);
        spec.setIndicator("Combo");
        host.addTab(spec);

        b1=(Button)view.findViewById(R.id.all1add);
        b2=(Button)view.findViewById(R.id.all1add2);
        b3=(Button)view.findViewById(R.id.all1add3);
        b4=(Button)view.findViewById(R.id.all1add4);
        b5=(Button)view.findViewById(R.id.all1add5);
        b6=(Button)view.findViewById(R.id.all1add6);
        b7=(Button)view.findViewById(R.id.all1add7);
        b8=(Button)view.findViewById(R.id.all1add8);
        b9=(Button)view.findViewById(R.id.all1add9);
        b10=(Button)view.findViewById(R.id.all1add10);
        b11=(Button)view.findViewById(R.id.all1add11);
        b12=(Button)view.findViewById(R.id.all1add12);
        b13=(Button)view.findViewById(R.id.all1add13);
        b14=(Button)view.findViewById(R.id.all1add14);
        b15=(Button)view.findViewById(R.id.all1add15);
        b16=(Button)view.findViewById(R.id.all1add16);
        b17=(Button)view.findViewById(R.id.all1add17);
        b18=(Button)view.findViewById(R.id.all1add18);
        b19=(Button)view.findViewById(R.id.all1add19);
        b20=(Button)view.findViewById(R.id.all1add20);
        b21=(Button)view.findViewById(R.id.all1add21);
        b22=(Button)view.findViewById(R.id.all1add22);
        b23=(Button)view.findViewById(R.id.all1add23);
        b24=(Button)view.findViewById(R.id.all1add24);
        b25=(Button)view.findViewById(R.id.all1add25);
        b26=(Button)view.findViewById(R.id.all1add26);
        b27=(Button)view.findViewById(R.id.all1add27);
        b31=(Button)view.findViewById(R.id.all1add31);
        b32=(Button)view.findViewById(R.id.all1add32);
        b33=(Button)view.findViewById(R.id.all1add33);
        b34=(Button)view.findViewById(R.id.all1add34);
        b35=(Button)view.findViewById(R.id.all1add35);
        b36=(Button)view.findViewById(R.id.all1add36);
        b41=(Button)view.findViewById(R.id.all1add41);
        b42=(Button)view.findViewById(R.id.all1add42);
        b43=(Button)view.findViewById(R.id.all1add43);
        b44=(Button)view.findViewById(R.id.all1add44);
        b51=(Button)view.findViewById(R.id.all1add51);
        b52=(Button)view.findViewById(R.id.all1add52);
        b53=(Button)view.findViewById(R.id.all1add53);


        int i1=21;
        t1=(TextView)view.findViewById(R.id.all1stk);
/*
        SharedPreferences sp=getContext().getSharedPreferences("AA",Context.MODE_PRIVATE);
        String nm=sp.getString("name","aa");
        t1.setText(nm);*/


        bcart=(Button)view.findViewById(R.id.tab1view);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Fried Rice \n";
                cartprice=cartprice+160;
                b1.setClickable(false);
                b1.setText("Added");
                b1.setBackgroundColor(Color.GREEN);


                b41.setClickable(false);
                b41.setText("Added");
                b41.setBackgroundColor(Color.GREEN);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Combo Pack A \n";
                cartprice=cartprice+225;
                b2.setClickable(false);
                b2.setText("Added");
                b2.setBackgroundColor(Color.GREEN);


                b51.setClickable(false);
                b51.setText("Added");
                b51.setBackgroundColor(Color.GREEN);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Lollipop  \n";
                cartprice=cartprice+140;
                b3.setClickable(false);
                b3.setText("Added");
                b3.setBackgroundColor(Color.GREEN);

                b21.setClickable(false);
                b21.setText("Added");
                b21.setBackgroundColor(Color.GREEN);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Triple Schewan Rice \n";
                cartprice=cartprice+175;
                b4.setClickable(false);
                b4.setText("Added");
                b4.setBackgroundColor(Color.GREEN);


                b42.setClickable(false);
                b42.setText("Added");
                b42.setBackgroundColor(Color.GREEN);


            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken 65 \n";
                cartprice=cartprice+150;
                b5.setClickable(false);
                b5.setText("Added");
                b5.setBackgroundColor(Color.GREEN);


                b22.setClickable(false);
                b22.setText("Added");
                b22.setBackgroundColor(Color.GREEN);


            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Soup \n";
                cartprice=cartprice+120;
                b6.setClickable(false);
                b6.setText("Added");
                b6.setBackgroundColor(Color.GREEN);


                b31.setClickable(false);
                b31.setText("Added");
                b31.setBackgroundColor(Color.GREEN);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Paneer Chilli \n";
                cartprice=cartprice+140;
                b7.setClickable(false);
                b7.setText("Added");
                b7.setBackgroundColor(Color.GREEN);


                b27.setClickable(false);
                b27.setText("Added");
                b27.setBackgroundColor(Color.GREEN);

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Manchow Soup \n";
                cartprice=cartprice+115;
                b8.setClickable(false);
                b8.setText("Added");
                b8.setBackgroundColor(Color.GREEN);


                b32.setClickable(false);
                b32.setText("Added");
                b32.setBackgroundColor(Color.GREEN);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Garlic Soup \n";
                cartprice=cartprice+125;
                b9.setClickable(false);
                b9.setText("Added");
                b9.setBackgroundColor(Color.GREEN);


                b33.setClickable(false);
                b33.setText("Added");
                b33.setBackgroundColor(Color.GREEN);


            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Combo Pack B \n";
                cartprice=cartprice+235;
                b10.setClickable(false);
                b10.setText("Added");
                b10.setBackgroundColor(Color.GREEN);

                b52.setClickable(false);
                b52.setText("Added");
                b52.setBackgroundColor(Color.GREEN);

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chiken Chilli \n";
                cartprice=cartprice+165;
                b11.setClickable(false);
                b11.setText("Added");
                b11.setBackgroundColor(Color.GREEN);

                b24.setClickable(false);
                b24.setText("Added");
                b24.setBackgroundColor(Color.GREEN);

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken 1000 Rice \n";
                cartprice=cartprice+175;
                b12.setClickable(false);
                b12.setText("Added");
                b12.setBackgroundColor(Color.GREEN);


                b43.setClickable(false);
                b43.setText("Added");
                b43.setBackgroundColor(Color.GREEN);

            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Paneer Manchurin Dry \n";
                cartprice=cartprice+165;
                b13.setClickable(false);
                b13.setText("Added");
                b13.setBackgroundColor(Color.GREEN);


                b25.setClickable(false);
                b25.setText("Added");
                b25.setBackgroundColor(Color.GREEN);

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Prawns Manchow Soup \n";
                cartprice=cartprice+125;
                b14.setClickable(false);
                b14.setText("Added");
                b14.setBackgroundColor(Color.GREEN);


                b34.setClickable(false);
                b34.setText("Added");
                b34.setBackgroundColor(Color.GREEN);

            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Crispy \n";
                cartprice=cartprice+165;
                b15.setClickable(false);
                b15.setText("Added");
                b15.setBackgroundColor(Color.GREEN);


                b23.setClickable(false);
                b23.setText("Added");
                b23.setBackgroundColor(Color.GREEN);

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Veg Manchow Soup \n";
                cartprice=cartprice+105;
                b16.setClickable(false);
                b16.setText("Added");
                b16.setBackgroundColor(Color.GREEN);

                b35.setClickable(false);
                b35.setText("Added");
                b35.setBackgroundColor(Color.GREEN);

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Hakka Noodles \n";
                cartprice=cartprice+145;
                b17.setClickable(false);
                b17.setText("Added");
                b17.setBackgroundColor(Color.GREEN);

                b44.setClickable(false);
                b44.setText("Added");
                b44.setBackgroundColor(Color.GREEN);
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Prawns 65 \n";
                cartprice=cartprice+205;
                b18.setClickable(false);
                b18.setText("Added");
                b18.setBackgroundColor(Color.GREEN);


                b26.setClickable(false);
                b26.setText("Added");
                b26.setBackgroundColor(Color.GREEN);

            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Spicy Thai Prawns Soup \n";
                cartprice=cartprice+135;
                b19.setClickable(false);
                b19.setText("Added");
                b19.setBackgroundColor(Color.GREEN);


                b36.setClickable(false);
                b36.setText("Added");
                b36.setBackgroundColor(Color.GREEN);

            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Combo Pack C \n";
                cartprice=cartprice+240;
                b20.setClickable(false);
                b20.setText("Added");
                b20.setBackgroundColor(Color.GREEN);


                b53.setClickable(false);
                b53.setText("Added");
                b53.setBackgroundColor(Color.GREEN);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Lollipop \n";
                cartprice=cartprice+140;

                b3.setClickable(false);
                b3.setText("Added");
                b3.setBackgroundColor(Color.GREEN);

                b21.setClickable(false);
                b21.setText("Added");
                b21.setBackgroundColor(Color.GREEN);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken 65 \n";
                cartprice=cartprice+150;
                b22.setClickable(false);
                b22.setText("Added");
                b22.setBackgroundColor(Color.GREEN);


                b5.setClickable(false);
                b5.setText("Added");
                b5.setBackgroundColor(Color.GREEN);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Crispy \n";
                cartprice=cartprice+165;
                b23.setClickable(false);
                b23.setText("Added");
                b23.setBackgroundColor(Color.GREEN);

                b15.setClickable(false);
                b15.setText("Added");
                b15.setBackgroundColor(Color.GREEN);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Chilli \n";
                cartprice=cartprice+165;
                b24.setClickable(false);
                b24.setText("Added");
                b24.setBackgroundColor(Color.GREEN);

                b11.setClickable(false);
                b11.setText("Added");
                b11.setBackgroundColor(Color.GREEN);

            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Paneer Manchurin Dry \n";
                cartprice=cartprice+165;
                b25.setClickable(false);
                b25.setText("Added");
                b25.setBackgroundColor(Color.GREEN);

                b13.setClickable(false);
                b13.setText("Added");
                b13.setBackgroundColor(Color.GREEN);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Prawns 65 \n";
                cartprice=cartprice+205;
                b26.setClickable(false);
                b26.setText("Added");
                b26.setBackgroundColor(Color.GREEN);

                b18.setClickable(false);
                b18.setText("Added");
                b18.setBackgroundColor(Color.GREEN);
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Paneer Chilli \n";
                cartprice=cartprice+140;
                b27.setClickable(false);
                b27.setText("Added");
                b27.setBackgroundColor(Color.GREEN);

                b7.setClickable(false);
                b7.setText("Added");
                b7.setBackgroundColor(Color.GREEN);
            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Soup \n";
                cartprice=cartprice+120;
                b31.setClickable(false);
                b31.setText("Added");
                b31.setBackgroundColor(Color.GREEN);


                b6.setClickable(false);
                b6.setText("Added");
                b6.setBackgroundColor(Color.GREEN);
            }
        });


        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Manchow Soup \n";
                cartprice=cartprice+115;
                b32.setClickable(false);
                b32.setText("Added");
                b32.setBackgroundColor(Color.GREEN);

                b8.setClickable(false);
                b8.setText("Added");
                b8.setBackgroundColor(Color.GREEN);

            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Garlic Soup \n";
                cartprice=cartprice+125;
                b33.setClickable(false);
                b33.setText("Added");
                b33.setBackgroundColor(Color.GREEN);


                b9.setClickable(false);
                b9.setText("Added");
                b9.setBackgroundColor(Color.GREEN);
            }
        });



        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Prawns Manchow Soup \n";
                cartprice=cartprice+125;
                b34.setClickable(false);
                b34.setText("Added");
                b34.setBackgroundColor(Color.GREEN);

                b14.setClickable(false);
                b14.setText("Added");
                b14.setBackgroundColor(Color.GREEN);
            }
        });


        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Veg Manchow Soup \n";
                cartprice=cartprice+105;
                b35.setClickable(false);
                b35.setText("Added");
                b35.setBackgroundColor(Color.GREEN);

                b16.setClickable(false);
                b16.setText("Added");
                b16.setBackgroundColor(Color.GREEN);

            }
        });


        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Spicy Thai Prawns Soup \n";
                cartprice=cartprice+135;
                b36.setClickable(false);
                b36.setText("Added");
                b36.setBackgroundColor(Color.GREEN);

                b19.setClickable(false);
                b19.setText("Added");
                b19.setBackgroundColor(Color.GREEN);
            }
        });

        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname=cartname+" Chicken Fried Rice \n";
                cartprice=cartprice+160;
                b41.setClickable(false);
                b41.setText("Added");
                b41.setBackgroundColor(Color.GREEN);

                b1.setClickable(false);
                b1.setText("Added");
                b1.setBackgroundColor(Color.GREEN);
            }
        });

        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname = cartname + " Chicken Triple Schezwan Rice \n";
                cartprice = cartprice + 175;
                b42.setClickable(false);
                b42.setText("Added");
                b42.setBackgroundColor(Color.GREEN);


                b4.setClickable(false);
                b4.setText("Added");
                b4.setBackgroundColor(Color.GREEN);
            }
        });

        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname = cartname + " Chicken 1000 Rice \n";
                cartprice = cartprice + 175;
                b43.setClickable(false);
                b43.setText("Added");
                b43.setBackgroundColor(Color.GREEN);

                b12.setClickable(false);
                b12.setText("Added");
                b12.setBackgroundColor(Color.GREEN);
            }
        });

        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname = cartname + " Chicken Hakka Noodles\n";
                cartprice = cartprice + 145;
                b44.setClickable(false);
                b44.setText("Added");
                b44.setBackgroundColor(Color.GREEN);

                b17.setClickable(false);
                b17.setText("Added");
                b17.setBackgroundColor(Color.GREEN);
            }
        });

        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname = cartname + " Combo Pack A\n";
                cartprice = cartprice + 225;
                b51.setClickable(false);
                b51.setText("Added");
                b51.setBackgroundColor(Color.GREEN);


                b2.setClickable(false);
                b2.setText("Added");
                b2.setBackgroundColor(Color.GREEN);
            }
        });

        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname = cartname + " Combo Pack B \n";
                cartprice = cartprice + 235;
                b52.setClickable(false);
                b52.setText("Added");
                b52.setBackgroundColor(Color.GREEN);

                b10.setClickable(false);
                b10.setText("Added");
                b10.setBackgroundColor(Color.GREEN);

            }
        });

        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartname = cartname + " Combo Pack C\n";
                cartprice = cartprice + 240;
                b53.setClickable(false);
                b53.setText("Added");
                b53.setBackgroundColor(Color.GREEN);

                b20.setClickable(false);
                b20.setText("Added");
                b20.setBackgroundColor(Color.GREEN);

            }
        });




        bcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /* fragmentManager=getFragmentManager();
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                fragment=new Create_List();
                transaction.replace(R.id.content1,fragment);
                transaction.commit();*/
                //Toast.makeText(getContext(),cartname + cartprice,Toast.LENGTH_SHORT).show();
                String finalamount=String.valueOf(cartprice);
                int finalamount1=cartprice+35;
                String finalamount2=String.valueOf(finalamount1);
                Create_List cl=new Create_List();
                Bundle args=new Bundle();

                args.putString("pname",cartname);
                args.putString("pprice",finalamount);
                args.putString("fprice",finalamount2);
                cl.setArguments(args);
                getFragmentManager().beginTransaction().replace(R.id.content1,cl).commit();
            }
        });
        return view;

    }
}