package com.durgaprasad.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    boolean isBart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isBart = true;
    }



    public void fadeImage(View v){
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
       if(isBart){
        bartImageView.animate().alpha(0).setDuration(2000);
        homerImageView.animate().alpha(1).setDuration(2000);
        isBart = false;
       }
       else{
           bartImageView.animate().alpha(1).setDuration(2000);
           homerImageView.animate().alpha(0).setDuration(2000);
           isBart = true;
       }
    }

}