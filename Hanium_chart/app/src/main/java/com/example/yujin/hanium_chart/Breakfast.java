package com.example.yujin.hanium_chart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast);

    }

    public void backBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),update.class);
        startActivity(myIntent);
    }


}

