package com.example.helloandroid3.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.helloandroid3.R;

public class IntentFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter);
        TextView intentData=findViewById(R.id.intentData);
        intentData.setText(getIntent().getDataString());
    }
}