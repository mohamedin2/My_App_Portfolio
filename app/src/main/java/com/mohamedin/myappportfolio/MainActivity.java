package com.mohamedin.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moviesAppBtn = (Button) findViewById(R.id.moviesAppBtn);
        moviesAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my popular movies project", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button stockAppBtn = (Button) findViewById(R.id.stockAppBtn);
        stockAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my stock hawk project", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button buildItAppBtn = (Button) findViewById(R.id.buildItAppBtn);
        buildItAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my build it bigger project", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button materialAppBtn = (Button) findViewById(R.id.materialAppBtn);
        materialAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my make your app material project", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button ubiqAppBtn = (Button) findViewById(R.id.ubiqAppBtn);
        ubiqAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous project", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button capstoneAppBtn = (Button) findViewById(R.id.capstoneAppBtn);
        capstoneAppBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my capstone project", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
