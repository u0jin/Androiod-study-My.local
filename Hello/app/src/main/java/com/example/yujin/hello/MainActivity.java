package com.example.yujin.hello;
// 이벤트 처리
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText =(EditText)findViewById(R.id.editText1);
        String strText =editText.getText().toString();

        final EditText editText1=(EditText)findViewById(R.id.editText1);
        Button button=(Button)findViewById(R.id.insetbutton);
        final TextView textView=(TextView)findViewById(R.id.textview4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText1.getText());
            }
        });

    }
    public void btn1Click(View v){
        Intent myIntent=new Intent(getApplicationContext(),NewActivity.class);
        startActivity(myIntent);
    }
}
