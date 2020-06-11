package com.ninestar.testdemo.Fragment.fragmentDemo1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ninestar.testdemo.R;

/**
 * 首页生活办公-->厨房标签类
 * 2020/6/11
 */
public class fragmentDemo1_kitchen extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_demo1_kitchen, container, false);
        return view;
    }
}
