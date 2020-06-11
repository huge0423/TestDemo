package com.ninestar.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_Rubbish;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_baby;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_bathroom;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_cosmetic;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_home;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_kitchen;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_medicine;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_room;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragmentDemo1_study;

/**
 * 首页生活家用类
 * 2020/6/11
 */
public class Bt_life extends AppCompatActivity implements View.OnClickListener{

    private TextView title_text;
    private Button nav_button;
    private Button bt_life_home;
    private Button bt_life_kitchen;
    private Button bt_life_room;
    private Button bt_life_bathroom;
    private Button bt_life_study;
    private Button bt_life_cosmetic;
    private Button bt_life_baby;
    private Button bt_life_medicine;
    private Button bt_life_Rubbish;
    private Button bt_life_home_storageBox;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_life);
        init();
    }

    public void init() {
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
        title_text = findViewById(R.id.title_text);
        title_text.setVisibility(View.VISIBLE);
        title_text.setText("生活家用");
        bt_life_home = findViewById(R.id.bt_life_home);
        bt_life_kitchen = findViewById(R.id.bt_life_kitchen);
        bt_life_room = findViewById(R.id.bt_life_room);
        bt_life_bathroom = findViewById(R.id.bt_life_bathroom);
        bt_life_study = findViewById(R.id.bt_life_study);
        bt_life_cosmetic = findViewById(R.id.bt_life_cosmetic);
        bt_life_baby = findViewById(R.id.bt_life_baby);
        bt_life_medicine = findViewById(R.id.bt_life_medicine);
        bt_life_Rubbish = findViewById(R.id.bt_life_Rubbish);
        bt_life_home.setOnClickListener(this);
        bt_life_kitchen.setOnClickListener(this);
        bt_life_room.setOnClickListener(this);
        bt_life_bathroom.setOnClickListener(this);
        bt_life_study.setOnClickListener(this);
        bt_life_cosmetic.setOnClickListener(this);
        bt_life_baby.setOnClickListener(this);
        bt_life_medicine.setOnClickListener(this);
        bt_life_Rubbish.setOnClickListener(this);
        replaceFragment(new fragmentDemo1_home());

/*        bt_life_home_storageBox = findViewById(R.id.bt_life_home_storageBox);
        bt_life_home_storageBox.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(this, MainActivity.class);
            startActivity(intent);
            Bt_life.this.finish();
        } else if (v.getId() == R.id.bt_life_home) {
            replaceFragment(new fragmentDemo1_home());
        } else if (v.getId() == R.id.bt_life_kitchen) {
            replaceFragment(new fragmentDemo1_kitchen());
        } else if (v.getId() == R.id.bt_life_room) {
            replaceFragment(new fragmentDemo1_room());
        } else if (v.getId() == R.id.bt_life_bathroom) {
            replaceFragment(new fragmentDemo1_bathroom());
        } else if (v.getId() == R.id.bt_life_study) {
            replaceFragment(new fragmentDemo1_study());
        } else if (v.getId() == R.id.bt_life_cosmetic) {
            replaceFragment(new fragmentDemo1_cosmetic());
        } else if (v.getId() == R.id.bt_life_baby) {
            replaceFragment(new fragmentDemo1_baby());
        } else if (v.getId() == R.id.bt_life_medicine) {
            replaceFragment(new fragmentDemo1_medicine());
        } else if (v.getId() == R.id.bt_life_Rubbish) {
            replaceFragment(new fragmentDemo1_Rubbish());
        }/* else if (v.getId() == R.id.bt_life_home_storageBox) {
            Intent intent = new Intent(this,life_home_storageBox.class);
        }*/
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_fragment,fragment);
        transaction.commit();
    }
}
