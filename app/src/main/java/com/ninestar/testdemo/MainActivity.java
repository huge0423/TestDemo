package com.ninestar.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_search;
    private ImageButton ib_pic;
    private Button bt_life;
    private Button bt_shop;
    private Button bt_office;
    private Button bt_play;
    private Button bt_mode;
    private Button bt_create;
    private ImageButton iv_home;
    private ImageButton iv_his;
    private ImageButton iv_person;
    private Button res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        bt_create = findViewById(R.id.bt_create);
        ib_pic = findViewById(R.id.ib_pic);
        bt_life = findViewById(R.id.bt_life);
        bt_shop = findViewById(R.id.bt_shop);
        bt_office = findViewById(R.id.bt_office);
        bt_play = findViewById(R.id.bt_play);
        bt_mode = findViewById(R.id.bt_mode);
        bt_create = findViewById(R.id.bt_create);
        bt_create.setOnClickListener(this);
        ib_pic.setOnClickListener(this);
        bt_life.setOnClickListener(this);
        bt_shop.setOnClickListener(this);
        bt_office.setOnClickListener(this);
        bt_play.setOnClickListener(this);
        bt_mode.setOnClickListener(this);
        iv_home = findViewById(R.id.iv_home);
        iv_his = findViewById(R.id.iv_his);
        iv_person = findViewById(R.id.iv_person);
        iv_home.setOnClickListener(this);
        iv_his.setOnClickListener(this);
        iv_person.setOnClickListener(this);
        res = findViewById(R.id.res);
        res.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_create) {
            Intent intent = new Intent(this, Create_label.class);
            startActivity(intent);
        } else if (v.getId() == R.id.ib_pic) {
            Intent intent = new Intent(this, Ib_pic.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life) {
            Intent intent = new Intent(this, Bt_life.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_shop) {
            Intent intent = new Intent(this, Bt_shop.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_office) {
            Intent intent = new Intent(this, Bt_office.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_play) {
            Intent intent = new Intent(this, Bt_play.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_mode) {
            Intent intent = new Intent(this, Bt_mode.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_his) {
            Intent intent = new Intent(this, History.class);
            startActivity(intent);
        } else if (v.getId() == R.id.iv_person) {
            Intent intent = new Intent(this, Person.class);
            startActivity(intent);
        } else if (v.getId() == R.id.res) {
            Intent intent = new Intent(this,Register.class);
            startActivity(intent);
        }
    }
}
