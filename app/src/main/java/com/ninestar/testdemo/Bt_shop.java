package com.ninestar.testdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.ninestar.testdemo.Fragment.fragmentDemo3.*/*fragmentDemo3_clothes*/;
//import com.ninestar.testdemo.Fragment.fragmentDemo3.fragmentDemo3_electricity;

public class Bt_shop extends AppCompatActivity implements View.OnClickListener {
    private Button nav_button;
    private TextView title_text;
    private Button bt_shop_electricity;
    private Button bt_shop_store;
    private Button bt_shop_Jewellery;
    private Button bt_shop_research;
    private Button bt_shop_clothes;
    private Button bt_shop_medical;
    private Button bt_shop_fresh;
    private Button bt_shop_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_shop);
        init();
    }

    public void init() {
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
        title_text = findViewById(R.id.title_text);
        title_text.setVisibility(View.VISIBLE);
        title_text.setText("商用标签");
        bt_shop_electricity = findViewById(R.id.bt_shop_electricity);
        bt_shop_store = findViewById(R.id.bt_shop_store);
        bt_shop_Jewellery = findViewById(R.id.bt_shop_Jewellery);
        bt_shop_research = findViewById(R.id.bt_shop_research);
        bt_shop_clothes = findViewById(R.id.bt_shop_clothes);
        bt_shop_medical = findViewById(R.id.bt_shop_medical);
        bt_shop_fresh = findViewById(R.id.bt_shop_fresh);
        bt_shop_name = findViewById(R.id.bt_shop_name);
        bt_shop_electricity.setOnClickListener(this);
        bt_shop_store.setOnClickListener(this);
        bt_shop_Jewellery.setOnClickListener(this);
        bt_shop_research.setOnClickListener(this);
        bt_shop_clothes.setOnClickListener(this);
        bt_shop_medical.setOnClickListener(this);
        bt_shop_fresh.setOnClickListener(this);
        bt_shop_name.setOnClickListener(this);
        replaceFragment(new fragmentDemo3_clothes());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(this, MainActivity.class);
            startActivity(intent);
            Bt_shop.this.finish();
        } else if (v.getId() == R.id.bt_shop_clothes) {
            replaceFragment(new fragmentDemo3_clothes());
        } else if (v.getId() == R.id.bt_shop_electricity) {
            replaceFragment(new fragmentDemo3_electricity());
        } else if (v.getId() == R.id.bt_shop_fresh) {
            replaceFragment(new fragmentDemo3_fresh());
        } else if (v.getId() == R.id.bt_shop_Jewellery) {
            replaceFragment(new fragmentDemo3_Jewellery());
        } else if (v.getId() == R.id.bt_shop_medical) {
            replaceFragment(new fragmentDemo3_medical());
        } else if (v.getId() == R.id.bt_shop_name) {
            replaceFragment(new fragmentDemo3_name());
        } else if (v.getId() == R.id.bt_shop_research) {
            replaceFragment(new fragmentDemo3_research());
        } else if (v.getId() == R.id.bt_shop_store) {
            replaceFragment(new fragmentDemo3_store());
        }
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_fragment_shop,fragment);
        transaction.commit();
    }
}
