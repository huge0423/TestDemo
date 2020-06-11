package com.ninestar.testdemo.Fragment.fragmentDemo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_Rubbish_recyclable;
import com.ninestar.testdemo.R;

/**
 * 首页生活办公-->垃圾分类 类
 * 2020/6/11
 */
public class fragmentDemo1_Rubbish extends Fragment implements View.OnClickListener {

    private Button bt_life_rubbish_recyclable;
    private Button bt_life_rubbish_harmful;
    private Button bt_life_rubbish_dried;
    private Button bt_life_rubbish_wet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_demo1__rubbish, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    public void init() {
        bt_life_rubbish_recyclable = getActivity().findViewById(R.id.bt_life_rubbish_recyclable);
        bt_life_rubbish_harmful = getActivity().findViewById(R.id.bt_life_rubbish_harmful);
        bt_life_rubbish_dried = getActivity().findViewById(R.id.bt_life_rubbish_dried);
        bt_life_rubbish_wet = getActivity().findViewById(R.id.bt_life_rubbish_wet);
        bt_life_rubbish_recyclable.setOnClickListener(this);
        bt_life_rubbish_harmful.setOnClickListener(this);
        bt_life_rubbish_dried.setOnClickListener(this);
        bt_life_rubbish_wet.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_life_rubbish_recyclable) {
            Intent intent = new Intent();
            intent.setClass(getActivity(), Life_Rubbish_recyclable.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life_rubbish_harmful) {

        } else if (v.getId() == R.id.bt_life_rubbish_dried) {

        } else if (v.getId() == R.id.bt_life_rubbish_wet) {

        }
    }
}
