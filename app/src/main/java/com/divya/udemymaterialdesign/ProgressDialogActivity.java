package com.divya.udemymaterialdesign;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressDialogActivity extends AppCompatActivity {

    ProgressDialog dialog;
    Handler handler;
    Timer timer;
    Runnable runnable;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);

       /* //Circular Progress Dialog
        dialog = new ProgressDialog(ProgressDialogActivity.this);
        dialog.setTitle("Progress Dialog");
        dialog.setMessage("Please wait...");
        dialog.show();
      //  dialog.cancel();*/

        //Linear Progress Dialog
        dialog = new ProgressDialog(ProgressDialogActivity.this);

        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

        dialog.setIndeterminate(false);

        dialog.setTitle("Progress Dialog");

        dialog.setMessage("Please wait...");

        dialog.show();

        dialog.setProgress(0);

        dialog.setMax(100);

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

               i = i+5;
                if(i<=100)
                {
                    dialog.setProgress(i);

                }else
                {
                    timer.cancel();
                    dialog.cancel();
                    i=0;
                }
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                handler.post(runnable);
            }
        },8000,500);
    }
}
