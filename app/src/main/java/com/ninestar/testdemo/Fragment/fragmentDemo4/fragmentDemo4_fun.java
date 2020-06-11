package com.ninestar.testdemo.Fragment.fragmentDemo4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ninestar.testdemo.R;

/**
 * 首页趣玩新奇-->趣玩新奇
 * 2020/6/11
 */
public class fragmentDemo4_fun extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_demo4_fun, container, false);
        return view;
    }
}
