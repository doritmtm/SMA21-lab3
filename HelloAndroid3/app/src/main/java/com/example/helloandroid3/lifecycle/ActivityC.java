package com.example.helloandroid3.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.helloandroid3.R;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Log.d("ActivityC","onCreate ActivityC");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityC","onStart ActivityC");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityC","onResume ActivityC");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityC","onPause ActivityC");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityC","onStop ActivityC");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityC","onRestart ActivityC");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityC", "onDestroy ActivityC");
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