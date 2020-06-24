package com.durgaprasad.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.setX(-2000);
        bartImageView.animate().translationXBy(2000).scaleX(0.5f).scaleY(0.5f).rotationBy(3600).setDuration(2000);
    }



    public void animateImage(View v){
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.animate().scaleX(1).scaleY(1).setDuration(1000);
    }

}