package com.divya.udemymaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        appCompatCheckBox = (AppCompatCheckBox)findViewById(R.id.checkbox_id);
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                //System.out.println(b);

                if(b)
                {
                    Toast.makeText(CheckBoxActivity.this, "Checkbox is selected", Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(CheckBoxActivity.this, "Checkbox is un_selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
