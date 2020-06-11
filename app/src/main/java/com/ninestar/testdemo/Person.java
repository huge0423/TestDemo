package com.ninestar.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 下标 我的 类
 * 2020/6/11
 */
public class Person extends AppCompatActivity implements View.OnClickListener {

    private TextView title_his;
    private Button bt_connection;
    private ImageButton iv_home;
    private ImageButton iv_his;
    private ImageButton iv_person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        init();
    }

    public void init() {
        iv_home = findViewById(R.id.iv_home);
        iv_his = findViewById(R.id.iv_his);
        iv_person = findViewById(R.id.iv_person);
        iv_home.setOnClickListener(this);
        iv_his.setOnClickListener(this);
        iv_person.setOnClickListener(this);
        bt_connection = findViewById(R.id.bt_connection);
        bt_connection.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.iv_home) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(Person.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_his) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(Person.this, History.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_person) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setClass(Person.this, Person.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_connection) {
            //连接蓝牙的逻辑
        }
    }
}
