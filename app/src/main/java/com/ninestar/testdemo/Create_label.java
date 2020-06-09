package com.ninestar.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Create_label extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private TextView title_create_type;
    private Button bt_type;
    private Button nav_button;
    private Button bt_create_type;
    private EditText et_label_name;
    private EditText et_label_width;
    private EditText et_label_height;
    private RadioButton rb_paper;
    private RadioButton rb_angle;
    private LinearLayout linear12;
    private LinearLayout linear13;
    private Switch sw_Cable;
    private RadioButton rb_up;
    private EditText et_tail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_label);
        init();
    }

    public void init() {
        title_create_type = findViewById(R.id.title_text);
        nav_button = findViewById(R.id.nav_button);
        title_create_type.setVisibility(View.VISIBLE);
        title_create_type.setText("标签设置");
        bt_type = findViewById(R.id.bt_type);
        bt_create_type = findViewById(R.id.bt_create_type);
        bt_create_type.setOnClickListener(this);
        bt_type.setOnClickListener(this);
        nav_button.setOnClickListener(this);
        et_label_name = findViewById(R.id.et_label_name);
        et_label_name.setText("android-test");
        et_label_width = findViewById(R.id.et_label_width);
        et_label_width.setText("50");
        et_label_height = findViewById(R.id.et_label_height);
        et_label_height.setText("20");
        rb_paper = findViewById(R.id.rb_paper);
        rb_angle = findViewById(R.id.rb_angle);
        rb_paper.setChecked(true);
        rb_angle.setChecked(true);
        linear12 = findViewById(R.id.linear12);
        linear13 = findViewById(R.id.linear13);
        sw_Cable = findViewById(R.id.sw_Cable);
        sw_Cable.setOnCheckedChangeListener(this);
        linear12.setVisibility(View.GONE);
        linear13.setVisibility(View.GONE);
        rb_up = findViewById(R.id.rb_up);
        rb_up.setChecked(true);
        et_tail = findViewById(R.id.et_tail);
        et_tail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_type) {
//            ShowDialog(v);
        } else if (v.getId() == R.id.nav_button) {
//            Intent intent = new Intent(this,MainActivity.class);
//            startActivity(intent);
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(Create_label.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_create_type) {
            Intent intent = new Intent();
            intent.setClass(this, Create_Type_Full.class);
            startActivity(intent);
        } else if (v.getId() == R.id.et_tail) {
            String s = et_tail.getText().toString();
            et_tail.setText("");
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            linear12.setVisibility(View.VISIBLE);
            linear13.setVisibility(View.VISIBLE);
        } else {
            linear12.setVisibility(View.GONE);
            linear13.setVisibility(View.GONE);
        }
    }
}
