package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class watch extends AppCompatActivity {
    Button btnstart;
    ImageView icanchor;
    Animation roundingalone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);
        btnstart = findViewById(R.id.btnstart);
        //btnstop = findViewById(R.id.btnstop);
        icanchor = findViewById(R.id.icanchor);
      //  timerHere = findViewById(R.id.timerHere);


        roundingalone = AnimationUtils.loadAnimation(this, R.anim.roundingalone);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  ivanchor.startAnimation(roundingalone);

            }
        });
    }
}