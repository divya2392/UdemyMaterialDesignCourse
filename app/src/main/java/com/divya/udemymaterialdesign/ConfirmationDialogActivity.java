package com.divya.udemymaterialdesign;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ConfirmationDialogActivity extends AppCompatActivity {

    AlertDialog dialog;
    AlertDialog.Builder builder;
    String[] items = {"Easy","Medium","Hard","Very Hard"};
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_dialog);

        builder = new AlertDialog.Builder(ConfirmationDialogActivity.this,R.style.ConfirmationDialogTheme);
        builder.setTitle("Select the difficulty level");
        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

               // System.out.println(i);
                result = items[i];


            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(ConfirmationDialogActivity.this, result, Toast.LENGTH_SHORT).show();

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(ConfirmationDialogActivity.this, "Cancel Button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        dialog = builder.create();
        dialog.show();

    }
}
