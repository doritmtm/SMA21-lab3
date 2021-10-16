package com.example.helloandroid3.listeners;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import com.example.helloandroid3.R;

import java.util.HashMap;
import java.util.Map;

public class SpinnerListener implements AdapterView.OnItemSelectedListener {
    private Button button;
    private Map<String,Integer> translate=new HashMap<>();
    public SpinnerListener(Button button)
    {
        this.button=button;
        translate.put("red", 0xFFFF0000);
        translate.put("yellow", 0xFFFFFF00);
        translate.put("green", 0xFF00FF00);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String color=(String)parent.getItemAtPosition(position);
        System.out.println(color);
        button.setTextColor(translate.get(color));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        System.out.println("onNothingSelected happened!!!!");
    }

}
