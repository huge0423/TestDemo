package com.ninestar.testdemo.Fragment.fragmentDemo3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ninestar.testdemo.R;

/**
 * 首页商用标签-->医疗标签
 * 2020/6/11
 */
public class fragmentDemo3_medical extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_demo3_medical, container, false);
        return view;
    }
}
