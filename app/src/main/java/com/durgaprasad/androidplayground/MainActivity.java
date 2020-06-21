package com.durgaprasad.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view){
        EditText editText = (EditText) findViewById(R.id.PersonName);
        Toast.makeText(this, "hello "+editText.getText().toString(), Toast.LENGTH_LONG).show();
    }
}