package com.divya.udemymaterialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static android.support.design.widget.BaseTransientBottomBar.LENGTH_INDEFINITE;
import static android.support.design.widget.Snackbar.make;

public class SnackBarActivity extends AppCompatActivity {

    Snackbar snackbar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        //View view = findViewById(R.id.snackbar_activity);

        fab = (FloatingActionButton)findViewById(R.id.fab_id);

       /* //snackbar 1 short length snackbar
        Snackbar.make(view,"Snackbar one Created",Snackbar.LENGTH_SHORT).show();*/

     /*  //snackbar 2 long length snackbar
        snackbar.make(view,"Snackbar second created",Snackbar.LENGTH_LONG).show();*/

     /* //snackbar 3 set duration in snackbar
        snackbar = Snackbar.make(view,"Snackbar third created",Snackbar.LENGTH_INDEFINITE);
        snackbar.setDuration(10000);
        snackbar.show();
        //snackbar.dismiss();*/

        //snackbar 4 Actions in snackbar
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                snackbar = Snackbar.make(view,"Snackbar 4th created_Message sent",LENGTH_INDEFINITE);
                snackbar.setDuration(8000);
                snackbar.setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        snackbar.dismiss();

                    }
                });

                View v = snackbar.getView();
                //change the color of snackbar backgrnd_action_textcolor
                v.setBackgroundColor(getResources().getColor(R.color.colorSnackBarBackground));

                TextView textView = (TextView)v.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(getResources().getColor(R.color.colorSnackBarText));

                TextView actionTextView = (TextView)v.findViewById(android.support.design.R.id.snackbar_action);
                actionTextView.setTextColor(getResources().getColor(R.color.colorSnackbarAction));

                snackbar.show();

            }
        });

    }
}