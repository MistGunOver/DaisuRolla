package com.example.daisurolla;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button plus_circle;
    String[] mobileArray = {"k3","k4","k6","k8",
            "k10","k20","k12","k100"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus_circle = (Button) findViewById(R.id.plus_circle);

        plus_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ListView listView = (ListView) findViewById(R.id.mobile_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.element, Arrays.asList(mobileArray));

        listView.setAdapter(adapter);

    }
}