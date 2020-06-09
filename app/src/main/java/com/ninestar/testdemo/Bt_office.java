package com.ninestar.testdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ninestar.testdemo.Fragment.fragmentDemo2.fragmentDemo2_assets;
import com.ninestar.testdemo.Fragment.fragmentDemo2.fragmentDemo2_book;

public class Bt_office extends AppCompatActivity implements View.OnClickListener {
    private Button nav_button;
    private TextView title_text;
    private Button bt_office_book;
    private Button bt_office_assets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_office);
        init();
    }

    public void init() {
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
        title_text = findViewById(R.id.title_text);
        title_text.setVisibility(View.VISIBLE);
        title_text.setText("企业办公");
        bt_office_book = findViewById(R.id.bt_office_book);
        bt_office_assets = findViewById(R.id.bt_office_assets);
        bt_office_book.setOnClickListener(this);
        bt_office_assets.setOnClickListener(this);
        replaceFragment(new fragmentDemo2_book());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(this, MainActivity.class);
            startActivity(intent);
            Bt_office.this.finish();
        } else if (v.getId() == R.id.bt_office_book) {
            replaceFragment(new fragmentDemo2_book());
        } else if (v.getId() == R.id.bt_office_assets) {
            replaceFragment(new fragmentDemo2_assets());
        }
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_fragment_office, fragment);
        transaction.commit();
    }
}
