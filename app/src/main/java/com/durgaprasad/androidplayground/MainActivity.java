package com.durgaprasad.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
    }
    public void btnClicked(View view){
        Snackbar.make(view,"its working hoolaa....", BaseTransientBottomBar.LENGTH_INDEFINITE).
                setAction("close",new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "closed successfully", Toast.LENGTH_SHORT).show();
                    }
                }).setActionTextColor(getResources().getColor(android.R.color.holo_orange_dark)) // you can choose any way to set color
                .setTextColor(Color.CYAN)
                .show();
    }
}