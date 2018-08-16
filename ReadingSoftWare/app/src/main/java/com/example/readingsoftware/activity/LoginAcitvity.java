package com.example.readingsoftware.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.readingsoftware.R;

import main.activity.MainActivity;

public class LoginAcitvity extends AppCompatActivity {

    TextView guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initview();
        setViewListener();
    }

    /**
     * 初始化界面
     */
    private void initview()
    {
        setContentView(R.layout.activity_login);
        guest= (TextView) findViewById(R.id.guest);
    }

    void setViewListener()
    {
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent to_main_activity=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(to_main_activity);
            }
        });
    }

}
