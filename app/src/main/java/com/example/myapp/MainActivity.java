package com.example.myapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button startBtn;
Button contactUs;
ImageView img;
Animation frombottom;
Animation blink;
Animation moving;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn =findViewById(R.id.start_button);
        contactUs =findViewById(R.id.buttonn);
        img =findViewById(R.id.bike);
        text =findViewById(R.id.text);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        img.setAnimation(frombottom);

        moving = AnimationUtils.loadAnimation(this,R.anim.move);
        text.setAnimation(moving);

        blink = AnimationUtils.loadAnimation(this,R.anim.blink);
        startBtn.setAnimation(blink);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this ,MainActivity2.class);
                startActivity(intent);
            }
        });
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this ,ContactUsActivity.class);
                startActivity(intent);
            }
        });
    }
}