package com.divya.udemymaterialdesign;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    AppCompatRadioButton appCompatRadioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

       /* appCompatRadioButton = (AppCompatRadioButton)findViewById(R.id.radio_button1);
        appCompatRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println(b);
            }
        });*/

        radioGroup = (RadioGroup)findViewById(R.id.radio_group_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i) {
                    case R.id.radio_button1:
                        Toast.makeText(RadioButtonActivity.this, "Radio Button 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_button2:
                        Toast.makeText(RadioButtonActivity.this, "Radio Button 2", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }
}
