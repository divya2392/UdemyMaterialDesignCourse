package com.divya.udemymaterialdesign;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar progressBar,interminateProgressBar;
    Handler handler;
    Runnable runnable;
    Timer timer;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = (ProgressBar)findViewById(R.id.progressbar_id);
        progressBar.setVisibility(View.VISIBLE);

        interminateProgressBar = (ProgressBar)findViewById(R.id.interminate_progressbar_id);
        interminateProgressBar.setVisibility(View.VISIBLE);
        interminateProgressBar.setProgress(0);
        interminateProgressBar.setSecondaryProgress(0);
        interminateProgressBar.setMax(100);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                //timer.cancel();
                //progressBar.setVisibility(View.GONE);

                if(++i<=100)
                {
                    interminateProgressBar.setProgress(i);
                    interminateProgressBar.setSecondaryProgress(i+10);
                }else
                {
                    timer.cancel();
                    //interminateProgressBar.setVisibility(View.GONE);
                }

            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                handler.post(runnable);

            }
        },8000,300);
    }
}
