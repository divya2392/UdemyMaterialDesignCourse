package com.divya.udemymaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    SwitchCompat switchCompat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        switchCompat = (SwitchCompat)findViewById(R.id.switch_id);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //System.out.println(b);

                if(b)
                {
                    Toast.makeText(SwitchActivity.this, "Switch ON", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(SwitchActivity.this, "Switch OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
