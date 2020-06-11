package com.ninestar.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 打印份数类
 * 2020/6/11
 */
public class PrintCount extends AppCompatActivity implements View.OnClickListener {

    private TextView title_text;
    private Button nav_button;
    private ImageButton ib_add;
    private ImageButton ib_sub;
    private EditText et_count;
    private int count = 1;
    private Button bt_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_count);
        init();
    }

    public void init() {
        title_text = findViewById(R.id.title_text);
        nav_button = findViewById(R.id.nav_button);
        ib_add = findViewById(R.id.ib_add);
        ib_sub = findViewById(R.id.ib_sub);
        et_count = findViewById(R.id.et_count);
        ib_add.setOnClickListener(this);
        ib_sub.setOnClickListener(this);
//        et_count.setText("");
        et_count.setOnClickListener(this);
        nav_button.setOnClickListener(this);
        title_text.setText("打印详情");
        et_count.setInputType(InputType.TYPE_CLASS_NUMBER);
        et_count.setCursorVisible(false);
        bt_print = findViewById(R.id.bt_print);
        bt_print.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int s1 = Integer.parseInt(et_count.getText().toString());
        if (v.getId() == R.id.nav_button) {
            Intent intent = new Intent(PrintCount.this, Create_Type_Full.class);
            startActivity(intent);
        } else if (v.getId() == R.id.ib_add) {
            if (s1 >= 99) {
                Toast.makeText(this, "最大打印数为99", Toast.LENGTH_SHORT).show();
            } else {
                String s = et_count.getText().toString();
                count = Integer.parseInt(s) + 1;
                et_count.setText(count + "");
            }
        } else if (v.getId() == R.id.ib_sub) {
            if (s1 <= 1) {
                et_count.setText(count + "");
                Toast.makeText(this, "最小打印数为1", Toast.LENGTH_SHORT).show();
            } else {
                String s = et_count.getText().toString();
                count = Integer.parseInt(s) - 1;
                et_count.setText(count + "");
            }
        } else if (v.getId() == R.id.et_count) {
            et_count.setText("");
            et_count.setCursorVisible(true);
        } else if (v.getId() == R.id.bt_print) {
            //打印逻辑
        }
    }
}
