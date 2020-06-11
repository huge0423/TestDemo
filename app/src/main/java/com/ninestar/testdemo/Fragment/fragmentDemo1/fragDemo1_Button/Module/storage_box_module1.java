package com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Module;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ninestar.testdemo.Create_Type_Full;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_storageBox;
import com.ninestar.testdemo.R;

/**
 * 首页生活办公-->家庭-客厅-->收纳柜-展示柜-->module1
 * 2020/6/11
 */
public class storage_box_module1 extends AppCompatActivity implements View.OnClickListener {

    private Button bt_edit;
    private Button nav_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_box_module1);
        init();
    }

    private void init() {
        bt_edit = findViewById(R.id.bt_all_edit);
        bt_edit.setOnClickListener(this);
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_all_edit) {
            Intent intent = new Intent(this, Create_Type_Full.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent(this, Life_home_storageBox.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
}
