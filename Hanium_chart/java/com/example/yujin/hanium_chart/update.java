package com.example.yujin.hanium_chart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
    }
    public void closeBtnClick(View v){
        Intent myIntent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);

    }
    public void BreakfastBtnClick(View v){
        Intent myIntent=new Intent(getApplicationContext(),Breakfast.class);
        startActivity(myIntent);
      
    }

}
