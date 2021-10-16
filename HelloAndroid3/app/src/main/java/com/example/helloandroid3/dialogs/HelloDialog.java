package com.example.helloandroid3.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class HelloDialog extends DialogFragment {
    public String message;
    public HelloDialog(String message)
    {
        this.message=message;
    }
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast t=Toast.makeText(getContext(),"Ok",Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
                .setNeutralButton("Not Now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast t=Toast.makeText(getContext(),"Neutral",Toast.LENGTH_SHORT);
                        t.show();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast t=Toast.makeText(getContext(),"Canceled",Toast.LENGTH_SHORT);
                        t.show();
                    }
                });
        return builder.create();
    }
}
