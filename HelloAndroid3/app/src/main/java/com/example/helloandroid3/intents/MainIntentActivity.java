package com.example.helloandroid3.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloandroid3.R;

public class MainIntentActivity extends AppCompatActivity {
    private Button bVGoogle,bCGoogle,bVTel,bCTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);
        bVGoogle=findViewById(R.id.bVGoogle);
        bCGoogle=findViewById(R.id.bCGoogle);
        bVTel=findViewById(R.id.bVTel);
        bCTel=findViewById(R.id.bCTel);
    }

    public void clicked(View view)
    {
        Intent intent=new Intent();
        switch(view.getId())
        {
            case R.id.bVGoogle:
                intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://google.com/"));
                break;
            case R.id.bCGoogle:
                intent=new Intent();
                intent.setAction("CUSTOM.VIEW.LAUNCH");
                intent.setData(Uri.parse("https://google.com/"));
                break;
            case R.id.bVTel:
                intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:00401213456"));
                break;
            case R.id.bCTel:
                intent=new Intent();
                intent.setAction("CUSTOM.VIEW.LAUNCH");
                intent.setData(Uri.parse("tel:00401213456"));
                break;
        }
        if(intent.resolveActivity(getPackageManager())!=null)
        {
            startActivity(intent);
        }
        else
        {
            Toast t=Toast.makeText(getApplicationContext(),"No available app!",Toast.LENGTH_SHORT);
            t.show();
        }
    }
}