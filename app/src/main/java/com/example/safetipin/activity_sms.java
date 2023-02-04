package com.example.safetipin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_sms extends AppCompatActivity {
    Button start,stop;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(activity_sms.this,MainActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        stop = findViewById(R.id.stopService);
        start = findViewById(R.id.startService);

        start.setOnClickListener(this::startServiceV);

        stop.setOnClickListener(this::stopService);

    }
    public void stopService(View view) {


    }
    public void startServiceV(View view) {

    }
}