package com.durgaprasad.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnClicked(View v){
        EditText editText = (EditText) findViewById(R.id.ammountText);
        Toast.makeText(this, String.format("%.2f",Double.parseDouble(editText.getText().toString()) * 76.3), Toast.LENGTH_SHORT).show();
    }

}