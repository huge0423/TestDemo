package com.ninestar.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class History extends AppCompatActivity implements View.OnClickListener {

    private TextView title_his;
    private Button nav_button;
    private ImageButton iv_home;
    private ImageButton iv_his;
    private ImageButton iv_person;
    private RadioButton rb_check;
    private boolean isselectall = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        init();
    }

    public void init() {
        title_his = findViewById(R.id.title_text);
        title_his.setVisibility(View.VISIBLE);
        title_his.setText("历史标签");
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
        iv_home = findViewById(R.id.iv_home);
        iv_his = findViewById(R.id.iv_his);
        iv_person = findViewById(R.id.iv_person);
        iv_home.setOnClickListener(this);
        iv_his.setOnClickListener(this);
        iv_person.setOnClickListener(this);
//        rb_check = findViewById(R.id.rb_check);
//        rb_check.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(History.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_home) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(History.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_his) {
            Intent intent = new Intent(this, History.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_person) {
            Intent intent = new Intent(this, Person.class);
            startActivity(intent);
        } /*else if (v.getId() == R.id.rb_check) {
         *//*            if (isselectall) {
                rb_check.setChecked(true);
                isselectall = true;
            }else{
                rb_check.setChecked(false);
                isselectall = false;
            }*//*
        }*/
    }
}
