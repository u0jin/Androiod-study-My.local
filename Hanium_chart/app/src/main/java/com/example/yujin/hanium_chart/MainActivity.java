package com.example.yujin.hanium_chart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void updateBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),update.class);
        startActivity(myIntent);
    }

}
