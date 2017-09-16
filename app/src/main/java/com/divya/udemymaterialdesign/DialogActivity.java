package com.divya.udemymaterialdesign;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    AlertDialog alertDialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        builder = new AlertDialog.Builder(DialogActivity.this,R.style.AlertDialogTheme);
        builder.setMessage("Discard Draft");

        builder.setPositiveButton("DISCARD", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                System.out.println("Discard");
                Toast.makeText(DialogActivity.this, "Discard button clicked", Toast.LENGTH_SHORT).show();

            }
        });

        builder.setNegativeButton("CANCLE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                System.out.println("Cancel");
                Toast.makeText(DialogActivity.this, "Cancle button clicked", Toast.LENGTH_SHORT).show();

            }
        });

        alertDialog = builder.create();
        alertDialog.show();

       /* alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
                .setTextColor(getResources().getColor(R.color.colorAlertDialog));*/
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)
                .setTextColor(getResources().getColor(R.color.colorAlertDialog));


    }
}
