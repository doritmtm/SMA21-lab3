package com.example.helloandroid3.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.helloandroid3.R;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.d("ActivityA","onCreate ActivityA");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityA","onStart ActivityA");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityA","onResume ActivityA");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityA","onPause ActivityA");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityA","onStop ActivityA");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityA","onRestart ActivityA");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityA", "onDestroy ActivityA");
    }

    public void clicked(View view)
    {
        switch(view.getId())
        {
            case R.id.bStartA:
                startActivity(new Intent(this,ActivityA.class));
                break;
            case R.id.bStartB:
                startActivity(new Intent(this,ActivityB.class));
                break;
            case R.id.bStartC:
                startActivity(new Intent(this,ActivityC.class));
                break;
        }
    }

}