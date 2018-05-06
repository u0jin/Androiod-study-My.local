package com.example.yujin.hello;
// 이벤트 처리

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    public void backbtnClick(View v){
        Toast.makeText(getApplicationContext(),"되돌아가기 버튼이 눌렸습니다.",Toast.LENGTH_LONG);
        finish(); //메인 화면 돌아가기
    }

}










