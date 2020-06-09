package com.ninestar.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private Button bt_res_new;  //注册新账号
    private Button bt_captcha;  //获取验证码
    private EditText et_captcha;  //输入验证码
    private Button bt_forget_pw;  //忘记密码
    private Button bt_login;  //登录
    private Button bt_res;  //注册
    private Button bt_hava_num; //已有账号
    private LinearLayout linear7; //验证码的布局

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    public void init() {
        bt_res_new = findViewById(R.id.bt_res_new);
        bt_captcha = findViewById(R.id.bt_captcha);
        et_captcha = findViewById(R.id.et_captcha);
        bt_forget_pw = findViewById(R.id.bt_forget_pw);
        bt_login = findViewById(R.id.bt_login);
        bt_res = findViewById(R.id.bt_res);
        bt_hava_num = findViewById(R.id.bt_hava_num);
        linear7 = findViewById(R.id.linear7);
        bt_res_new.setOnClickListener(this);
        bt_captcha.setOnClickListener(this);
        et_captcha.setOnClickListener(this);
        bt_forget_pw.setOnClickListener(this);
        bt_login.setOnClickListener(this);
        bt_res.setOnClickListener(this);
        bt_hava_num.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_res_new) {
            linear7.setVisibility(View.VISIBLE);
            bt_res_new.setVisibility(View.GONE);
            bt_hava_num.setVisibility(View.VISIBLE);
            bt_login.setVisibility(View.GONE);
            bt_forget_pw.setVisibility(View.GONE);
            bt_res.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.bt_hava_num) {
            linear7.setVisibility(View.GONE);
            bt_res_new.setVisibility(View.VISIBLE);
            bt_hava_num.setVisibility(View.GONE);
            bt_login.setVisibility(View.VISIBLE);
            bt_forget_pw.setVisibility(View.VISIBLE);
            bt_res.setVisibility(View.GONE);
        }
    }
}
