package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends MainActivity {

    LifeCycleCounter mainLCC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        mainLCC = (LifeCycleCounter) intent.getParcelableExtra("counter");
    }

    @Override
    public void showLCC() {

    }
}