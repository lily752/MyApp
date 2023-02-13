package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class timer extends AppCompatActivity {
    Button btnstart;
    Button btnstop;
    Button scan;
    TextView timeOfRide;
    TextView cost;

   // Camera camera = Camera.open();
    public long startTime;
    private boolean isStarted = false;
    int unlock = 5;
    double finalCost = 0;
    //Calendar calendar = Calendar.getInstance();
    // Date currentTime = calendar.getTime();
    // SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    // String formattedTime = timeFormat.format(currentTime);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        cost = findViewById(R.id.cost);
        btnstart = findViewById(R.id.btnstart);
        scan = findViewById(R.id.scan);
        btnstop = findViewById(R.id.btnstop);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTime = SystemClock.elapsedRealtime();
                isStarted = true;
            }
        });
        // icanchor = findViewById(R.id.icanchor);
        //View timerHere = findViewById(R.id.timerHere);
        //btnstart.setOnClickListener(new View.OnClickListener() {
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                //ivanchor.startAnimation(roundingalone);
                if (isStarted) {
                    long elapsedTime = SystemClock.elapsedRealtime() - startTime;
                    int seconds = (int) (elapsedTime / 1000) % 60;
                    int minutes = (int) ((elapsedTime / (1000 * 60)) % 60);
                    int hours = (int) ((elapsedTime / (1000 * 60 * 60)) % 24);
                    cost.setText(hours + ":" + minutes + ":" + seconds);
                    finalCost = (unlock + (minutes * 0.09));
                    timeOfRide.setText("The cost of the ride is:" + finalCost);
                    isStarted = false;
                }
            }
        });

            scan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(timer.this ,QRCode.class);
                    startActivity(intent);
                }
            });







    }
   /* protected void onResume() {
        super.onResume();

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                long elapsedTime = SystemClock.elapsedRealtime() - startTime;
                int seconds = (int) (elapsedTime / 1000) % 60 ;
                int minutes = (int) ((elapsedTime / (1000*60)) % 60);
                int hours   = (int) ((elapsedTime / (1000*60*60)) % 24);
                cost = (unlock + (minutes*0.09));
                textView.setText(hours + ":" + minutes + ":" + seconds);
                textView.setText("The cost is"+ cost);
                handler.postDelayed(this, 1000);
            }
        });*/
}