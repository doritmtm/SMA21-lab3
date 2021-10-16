package com.example.helloandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloandroid3.dialogs.HelloDialog;
import com.example.helloandroid3.lifecycle.ActivityA;
import com.example.helloandroid3.listeners.SpinnerListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private Button bName, bStartAMain;
    private FloatingActionButton bShare,bSearch;
    private TextView tName;
    private Spinner sColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName=findViewById(R.id.eName);
        bName=findViewById(R.id.bName);
        tName=findViewById(R.id.tName);
        bStartAMain =findViewById(R.id.bStartAMain);
        bShare=findViewById(R.id.bShare);
        bSearch=findViewById(R.id.bSearch);
        sColor=findViewById(R.id.sColor);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.color_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sColor.setAdapter(adapter);
        SpinnerListener sl=new SpinnerListener(bName);
        sColor.setOnItemSelectedListener(sl);
    }
    public void clicked(View view)
    {
        HelloDialog helloDialog;
        Intent sendIntent;
        switch(view.getId())
        {
            case R.id.bName:
                tName.setText("Hello, "+eName.getText());
                helloDialog=new HelloDialog("Hello, "+eName.getText());
                helloDialog.show(getSupportFragmentManager(),"mock");
                break;
            case R.id.bStartAMain:
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.bShare:
                sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,eName.getText());
                sendIntent.setType("text/plain");
                if(sendIntent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(sendIntent);
                }
                else
                {
                    Toast t=Toast.makeText(getApplicationContext(),"No available app!",Toast.LENGTH_SHORT);
                    t.show();
                }
                break;
            case R.id.bSearch:
                sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_VIEW);
                String url="https://google.com/search?q="+eName.getText();
                sendIntent.setData(Uri.parse(url));
                if(sendIntent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(sendIntent);
                }
                else
                {
                    Toast t=Toast.makeText(getApplicationContext(),"No available app!",Toast.LENGTH_SHORT);
                    t.show();
                }
                break;
        }
    }
}