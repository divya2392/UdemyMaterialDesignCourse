package com.divya.udemymaterialdesign;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class BottomnavActivityPartOne extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnavigation_partone);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation_id);
        textView = (TextView)findViewById(R.id.text_id);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id)
        {
            case R.id.recents_id:
                textView.setText(getResources().getText(R.string.recents));
                break;

            case R.id.favorites_id:
                textView.setText(getResources().getText(R.string.favorite));
                break;

            case R.id.nearby_id:
                textView.setText(getResources().getText(R.string.near_by));
                break;
        }

        return false;
    }
}
