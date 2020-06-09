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

import com.ninestar.testdemo.Fragment.fragmentDemo4.fragmentDemo4_fun;

public class Bt_play extends AppCompatActivity implements View.OnClickListener {
    private Button nav_button;
    private TextView title_text;
    private Button bt_play_fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_play);
        init();
    }

    public void init() {
        nav_button = findViewById(R.id.nav_button);
        nav_button.setOnClickListener(this);
        title_text = findViewById(R.id.title_text);
        title_text.setVisibility(View.VISIBLE);
        title_text.setText("趣玩新奇");
        bt_play_fun = findViewById(R.id.bt_play_fun);
        bt_play_fun.setOnClickListener(this);
        replaceFragment(new fragmentDemo4_fun());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(this,MainActivity.class);
            startActivity(intent);
            Bt_play.this.finish();
        } else if (v.getId() == R.id.bt_play_fun) {
            replaceFragment(new fragmentDemo4_fun());
        }
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_fragment_play,fragment);
        transaction.commit();
    }
}
