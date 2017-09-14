package com.divya.udemymaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener{

    AppCompatButton raisedButton;
    AppCompatButton flatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        raisedButton = (AppCompatButton)findViewById(R.id.raised_btn);
        raisedButton.setOnClickListener(this);

        flatButton = (AppCompatButton)findViewById(R.id.flat_btn);
        flatButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if(id == R.id.raised_btn)
        {
            Toast.makeText(ButtonActivity.this, "Raised Button Clicked", Toast.LENGTH_SHORT).show();

        }else if(id == R.id.flat_btn)
        {
            Toast.makeText(ButtonActivity.this, "Flat Button Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
