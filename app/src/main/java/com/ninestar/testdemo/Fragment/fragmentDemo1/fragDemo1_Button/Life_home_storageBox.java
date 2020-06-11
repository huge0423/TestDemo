package com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ninestar.testdemo.Bt_life;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Module.storage_box_module1;
import com.ninestar.testdemo.R;

/**
 * 首页生活办公-->家庭-客厅-->收纳柜-展示柜
 * 2020/6/11
 */
public class Life_home_storageBox extends AppCompatActivity implements View.OnClickListener {
    private TextView title_text;
    private Button nav_button;
    private Button demo1;
    private Button demo2;
    private Button demo3;
    private Button demo4;
    private Button demo5;
    private Button demo6;
    private Button demo7;
    private Button demo8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_home_storage_box);
        init();
    }

    public void init() {
        title_text = findViewById(R.id.title_text);
        title_text.setText("收纳柜-展示柜");
        title_text.setVisibility(View.VISIBLE);
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
        demo1 = findViewById(R.id.demo1);
        Drawable drawable = getResources().getDrawable(R.drawable.sofa);
        drawable.setBounds(10, 100, 660, 430);
        demo1.setCompoundDrawables(null, drawable, null, null);
        demo2 = findViewById(R.id.demo2);
        demo2.setCompoundDrawables(null, drawable, null, null);
        demo3 = findViewById(R.id.demo3);
        demo4 = findViewById(R.id.demo4);
        demo5 = findViewById(R.id.demo5);
        demo6 = findViewById(R.id.demo6);
        demo7 = findViewById(R.id.demo7);
        demo8 = findViewById(R.id.demo8);
        demo3.setCompoundDrawables(null, drawable, null, null);
        demo4.setCompoundDrawables(null, drawable, null, null);
        demo5.setCompoundDrawables(null, drawable, null, null);
        demo6.setCompoundDrawables(null, drawable, null, null);
        demo7.setCompoundDrawables(null, drawable, null, null);
        demo8.setCompoundDrawables(null, drawable, null, null);
        demo1.setOnClickListener(this);
        demo2.setOnClickListener(this);
        demo3.setOnClickListener(this);
        demo4.setOnClickListener(this);
        demo5.setOnClickListener(this);
        demo6.setOnClickListener(this);
        demo7.setOnClickListener(this);
        demo8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setClass(this, Bt_life.class);
            startActivity(intent);
        } else if (v.getId() == R.id.demo1) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setClass(this, storage_box_module1.class);
            startActivity(intent);
        }
    }
}
