package com.durgaprasad.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImageBtnclicked(View v){
        ImageView imageView = (ImageView) findViewById(R.id.catimageView);
        if ("catImage".equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.tiger);
            imageView.setTag("tigerImage");
        }
        else {
            imageView.setImageResource(R.drawable.cat);
            imageView.setTag("catImage");
        }
    }

}