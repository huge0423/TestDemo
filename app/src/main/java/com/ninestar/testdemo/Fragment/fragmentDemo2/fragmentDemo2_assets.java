package com.ninestar.testdemo.Fragment.fragmentDemo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ninestar.testdemo.R;

/**
 * 首页企业办公-->固定资产
 * 2020/6/11
 */
public class fragmentDemo2_assets extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_demo2_assets, container, false);
        return view;
    }

}
