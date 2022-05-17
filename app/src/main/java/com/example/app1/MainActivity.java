package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int anzCreate = 0;
    int anzResume = 0;
    int anzPause = 0;
    int anzStop = 0;
    int anzDestroy = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anzCreate++;
        ((TextView)findViewById(R.id.tvCreate)).setText(""+anzCreate);
    }

    @Override
    protected void onPause() {
        super.onPause();
        anzPause++;
        ((TextView)findViewById(R.id.tvPause)).setText(""+anzPause);
    }

    @Override
    protected void onResume() {
        super.onResume();
        anzResume++;
        ((TextView)findViewById(R.id.tvResume)).setText(""+anzResume);
    }

    @Override
    protected void onStop() {
        super.onStop();
        anzStop++;
        ((TextView)findViewById(R.id.tvStop)).setText(""+anzStop);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        anzDestroy++;
        ((TextView)findViewById(R.id.tvDestroy)).setText(""+anzDestroy);
    }

    public void wechsel(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}