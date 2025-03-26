package com.example.resturat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer timer;
    private ProgressBar pgbar;
    private int i = 0;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        pgbar = (ProgressBar) findViewById(R.id.splash_pg1);
        pgbar.setProgress(0);
        textview = (TextView) findViewById(R.id.splash_txt);
        textview.setText("");
        final long period = 100;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(i<100)
                {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textview.setText(String.valueOf(i)+"%");
                        }
                    });
                    pgbar.setProgress(i);
                    i++;
                }
                else
                {
                    timer.cancel();
                    Intent intent=new Intent(MainActivity.this,Login.class);
                    startActivity(intent);
                    finish();
                }
            }
        },0,period);

    }
}