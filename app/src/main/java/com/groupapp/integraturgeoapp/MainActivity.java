package com.groupapp.integraturgeoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.groupapp.integraturgeoapp.TrackeoEstudent.Track_GoogleEstudent_Activity;

public class MainActivity extends AppCompatActivity {

    Button btndriver;
    Button btnEstudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // btndriver = findViewById(R.id.btndriver);
        btnEstudent = findViewById(R.id.btnEstudent);

        btnEstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Track_GoogleEstudent_Activity.class);
                startActivity(intent);
            }
        });
    }
}