package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class bike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bike);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewB);

// Create a rounded drawable
        GradientDrawable roundedDrawable = new GradientDrawable();
        roundedDrawable.setCornerRadius(30);
        imageView.setImageDrawable(roundedDrawable);

    }
}