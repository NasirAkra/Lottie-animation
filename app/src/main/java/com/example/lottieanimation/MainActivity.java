package com.example.lottieanimation;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {
LottieAnimationView animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation=findViewById(R.id.lottie);
        animation.playAnimation();
        animation.loop(true);
    }
}