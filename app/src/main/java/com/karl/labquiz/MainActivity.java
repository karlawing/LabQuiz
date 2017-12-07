package com.karl.labquiz;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    String PREFS_NAME = "mypre";
    String PREF_USERNAME = "username";
    String PREF_PASSWORD = "password";
    EditText User;
    Button btn_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = (EditText) findViewById(R.id.User);

    }

    public void login(View view) {
        Intent intent=new Intent(this, SecondActivity.class);
        intent.putExtra("user", (Parcelable) User);
        startActivity(intent);


    }
}
