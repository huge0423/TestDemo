package com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ninestar.testdemo.Bt_life;
import com.ninestar.testdemo.R;

public class Life_home_storageBox extends AppCompatActivity implements View.OnClickListener {
    private TextView title_text;
    private Button nav_button;

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
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setClass(this, Bt_life.class);
            startActivity(intent);
        }
    }
}
