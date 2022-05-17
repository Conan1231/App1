package com.example.app1;

import androidx.annotation.NonNull;
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
    int anzStart = 0;

    LifeCycleCounter LCC = new LifeCycleCounter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null){
            LCC = (LifeCycleCounter) savedInstanceState.getParcelable("COUNTER");
        }
        setContentView(R.layout.activity_main);
        LCC.anzCreate++;
        showLCC();
    }

    public void showLCC(){
        ((TextView) findViewById(R.id.tvPause)).setText("" + LCC.anzPause);
        ((TextView) findViewById(R.id.tvStart)).setText("" + LCC.anzStart);
        ((TextView) findViewById(R.id.tvResume)).setText("" + LCC.anzResume);
        ((TextView) findViewById(R.id.tvStop)).setText("" + LCC.anzStop);
        ((TextView) findViewById(R.id.tvDestroy)).setText("" + LCC.anzDestroy);
        ((TextView) findViewById(R.id.tvCreate)).setText("" + LCC.anzCreate);
    }

    @Override
    protected void onStart(){
        super.onStart();
        LCC.anzStart++;
        showLCC();
    }

    @Override
    protected void onPause() {
        super.onPause();
        LCC.anzPause++;
        showLCC();
    }

    @Override
    protected void onResume() {
        super.onResume();
        LCC.anzResume++;
       showLCC();
    }

    @Override
    protected void onStop() {
        super.onStop();
        LCC.anzStop++;
        showLCC();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LCC.anzDestroy++;
        showLCC();
    }


    public void wechsel(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("counter", LCC);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("COUNTER",LCC);
    }
}