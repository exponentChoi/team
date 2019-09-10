package com.example.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    private Spinner spinnerLocationProvider = null ;
    ImageButton img_btn1;
    ImageButton img_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerLocationProvider = (Spinner)findViewById(R.id.spinnerLocationProvider );
        img_btn1 = findViewById(R.id.img_btn1);
        img_btn2 = findViewById(R.id.img_btn2);

        img_btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Cloth.class);
                startActivity(intent);
            }
        });


        img_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Gps.class);
                startActivity(intent);
            }
        });
    }
}
