package com.ninestar.testdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Create_Type_Full extends AppCompatActivity implements View.OnClickListener {

    private Button nav_button;
    private Button bt_okPrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__type__full);
        init();
    }

    public void init() {
        nav_button = findViewById(R.id.nav_button);
        bt_okPrint = findViewById(R.id.bt_okPrint);
        nav_button.setOnClickListener(this);
        bt_okPrint.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nav_button) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("是否保存后退出?");
            builder.setNegativeButton("不保存", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent();
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setClass(Create_Type_Full.this, MainActivity.class);
                    startActivity(intent);
                }
            });
            builder.setPositiveButton("保存", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent();
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setClass(Create_Type_Full.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(Create_Type_Full.this, "保存成功", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();
//            AlertDialog dialog = builder.create();
//            dialog.show();
/*            Snackbar.make(v,"是否保存后退出？",Snackbar.LENGTH_SHORT)
                    .setAction("不保存", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent();
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.setClass(Create_Type_Full.this,MainActivity.class);
                            startActivity(intent);
                        }
                    })
                    .show();*/
        } else if (v.getId() == R.id.bt_okPrint) {
            Intent intent = new Intent(this, PrintCount.class);
            startActivity(intent);
        }
    }
}
