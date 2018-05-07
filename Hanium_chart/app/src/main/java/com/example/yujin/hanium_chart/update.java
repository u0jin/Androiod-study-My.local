package com.example.yujin.hanium_chart;

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
    public void backBtnClick(View v){
        Toast.makeText(getApplicationContext(),"되돌아가기 버튼이 눌렸습니다.",Toast.LENGTH_LONG);
        finish(); //이전 화면 돌아가기

    }

}
