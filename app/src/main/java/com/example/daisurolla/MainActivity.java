package com.example.daisurolla;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button plus_circle = findViewById(R.id.plus_circle);
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus_circle = (Button) findViewById(R.id.plus_circle);

    }
}
