package com.karl.labquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by asus on 12/7/2017.
 */

public class SecondActivity extends AppCompatActivity {

    TextView tv_Greeting;
    Button btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tv_Greeting = (TextView) findViewById(R. id.tvGreeting);
        btn_logout = (Button) findViewById(R. id.btn_logout);

        Intent intent = new Intent();
        String name = intent.getExtras().getString("name");

        tv_Greeting.setText("Hello" + name);

        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);


    }



}
