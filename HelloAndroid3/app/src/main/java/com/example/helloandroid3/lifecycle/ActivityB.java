package com.example.helloandroid3.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.helloandroid3.R;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d("ActivityB","onCreate ActivityB");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityB","onStart ActivityB");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityB","onResume ActivityB");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityB","onPause ActivityB");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityB","onStop ActivityB");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityB","onRestart ActivityB");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityB", "onDestroy ActivityB");
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