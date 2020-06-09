package com.ninestar.testdemo.Fragment.fragmentDemo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_electrical;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_open;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_remoteControl;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_sort;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_storageBox;
import com.ninestar.testdemo.Fragment.fragmentDemo1.fragDemo1_Button.Life_home_wine;
import com.ninestar.testdemo.R;

public class fragmentDemo1_home extends Fragment implements View.OnClickListener {

    private Button bt_life_home_storageBox;
    private Button bt_life_home_wine;
    private Button bt_life_home_electrical;
    private Button bt_life_home_open;
    private Button bt_life_home_remoteControl;
    private Button bt_life_home_sort;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.avtivity_fragment_demo1_home, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bt_life_home_storageBox = getActivity().findViewById(R.id.bt_life_home_storageBox);
        bt_life_home_storageBox.setOnClickListener(this);
        bt_life_home_wine = getActivity().findViewById(R.id.bt_life_home_wine);
        bt_life_home_electrical = getActivity().findViewById(R.id.bt_life_home_electrical);
        bt_life_home_open = getActivity().findViewById(R.id.bt_life_home_open);
        bt_life_home_remoteControl = getActivity().findViewById(R.id.bt_life_home_remoteControl);
        bt_life_home_sort = getActivity().findViewById(R.id.bt_life_home_sort);
        bt_life_home_wine.setOnClickListener(this);
        bt_life_home_electrical.setOnClickListener(this);
        bt_life_home_open.setOnClickListener(this);
        bt_life_home_remoteControl.setOnClickListener(this);
        bt_life_home_sort.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_life_home_storageBox) {
            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(getActivity(), Life_home_storageBox.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life_home_wine) {
            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(getActivity(), Life_home_wine.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life_home_electrical) {
            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(getActivity(), Life_home_electrical.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life_home_open) {
            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(getActivity(), Life_home_open.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life_home_remoteControl) {
            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(getActivity(), Life_home_remoteControl.class);
            startActivity(intent);
        } else if (v.getId() == R.id.bt_life_home_sort) {
            Intent intent = new Intent();
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setClass(getActivity(), Life_home_sort.class);
            startActivity(intent);
        }
    }
}
