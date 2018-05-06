package com.example.yujin.hello;
// 이벤트 처리
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1Click(View v){
        Intent myIntent=new Intent(getApplicationContext(),NewActivity.class);
        startActivity(myIntent);
    }
}
