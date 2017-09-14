package com.divya.udemymaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    AppCompatButton raisedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        raisedButton = (AppCompatButton)findViewById(R.id.raised_btn);
        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ButtonActivity.this, "Raised Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
