package com.example.yujin.hanium_chart;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Breakfast extends AppCompatActivity {
    Button btn = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast);
        setup();

    }

    public void backBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),update.class);
        startActivity(myIntent);
    }

    public void photoUploadBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),update.class);
        startActivity(myIntent);
    }
    private void setup()
    {
        btn = (Button)findViewById(R.id.photoUploadBtn);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

    }

    public void searchBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),update.class);
        startActivity(myIntent);
    }


}

