package com.example.gatoactivity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(5000, 1000)
        {
            @Override
            public void onTick(long ml)
            {

            }

            public void onFinish()
            {
                Intent i = new Intent(MainActivity.this, GatoActivity.class);
                startActivity(i);
                finish();
            }

        }.start();
    }
}
