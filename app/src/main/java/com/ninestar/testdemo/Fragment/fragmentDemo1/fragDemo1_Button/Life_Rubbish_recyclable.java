package com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ninestar.testdemo.R;

/**
 * 首页生活办公-->垃圾分类-->可回收垃圾
 * 2020/6/11
 */
public class Life_Rubbish_recyclable extends AppCompatActivity implements View.OnClickListener {

    private TextView title_text;
    private Button nav_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life__rubbish_recyclable);
        init();
    }

    public void init() {
        title_text = findViewById(R.id.title_text);
        title_text.setText("可回收垃圾");
        title_text.setVisibility(View.VISIBLE);
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
//            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            intent.setClass(this, Bt_life.class);
//            startActivity(intent);
            finish();
        }
    }
}
