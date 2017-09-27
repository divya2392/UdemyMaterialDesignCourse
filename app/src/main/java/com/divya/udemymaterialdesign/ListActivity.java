package com.divya.udemymaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bootomNav;
    private Button button;
    private Button checkBox;
    private Button confirmationDialog;
    private Button dialog;
    private Button progressBar;
    private Button progressdialog;
    private Button radiobutton;
    private Button snackBar;
    private Button switchButton;
    private Button textdesign;
    private Button viewPager;
    private Button loginRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        bootomNav = (Button)findViewById(R.id.bottom_nav);
        bootomNav.setOnClickListener(this);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        checkBox = (Button)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(this);
        confirmationDialog = (Button)findViewById(R.id.confirmation_dialog);
        confirmationDialog.setOnClickListener(this);
        dialog = (Button)findViewById(R.id.dialog);
        dialog.setOnClickListener(this);
        progressBar = (Button)findViewById(R.id.progress_bar);
        progressBar.setOnClickListener(this);
        progressdialog = (Button)findViewById(R.id.progress_dialog);
        progressdialog.setOnClickListener(this);
        radiobutton = (Button)findViewById(R.id.radio_button);
        radiobutton.setOnClickListener(this);
        snackBar = (Button)findViewById(R.id.snack_bar);
        snackBar.setOnClickListener(this);
        switchButton = (Button)findViewById(R.id.switch_button);
        switchButton.setOnClickListener(this);
        textdesign = (Button)findViewById(R.id.text);
        textdesign.setOnClickListener(this);
        viewPager = (Button)findViewById(R.id.view_pager);
        viewPager.setOnClickListener(this);
        loginRegistration = (Button)findViewById(R.id.login_registration);
        loginRegistration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch(id)
        {
            case R.id.bottom_nav:
                Intent intentbottom_nav = new Intent(ListActivity.this,BottomnavActivityPartOne.class);
                startActivity(intentbottom_nav);
                break;

            case R.id.button:
                Intent intentbutton = new Intent(ListActivity.this,ButtonActivity.class);
                startActivity(intentbutton);
                break;

            case R.id.checkBox:
                Intent intentcheckBox = new Intent(ListActivity.this,CheckBoxActivity.class);
                startActivity(intentcheckBox);

                break;

            case R.id.confirmation_dialog:
                Intent intentconfirmation_dialog = new Intent(ListActivity.this,ConfirmationDialogActivity.class);
                startActivity(intentconfirmation_dialog);
                break;

            case R.id.dialog:
                Intent intentdialog = new Intent(ListActivity.this,DialogActivity.class);
                startActivity(intentdialog);
                break;

            case R.id.progress_bar:
                Intent intentprogress_bar = new Intent(ListActivity.this,ProgressBarActivity.class);
                startActivity(intentprogress_bar);
                break;

            case R.id.progress_dialog:
                Intent intentprogress_dialog = new Intent(ListActivity.this,ProgressDialogActivity.class);
                startActivity(intentprogress_dialog);
                break;

            case R.id.radio_button:
                Intent intentradio_button = new Intent(ListActivity.this,RadioButtonActivity.class);
                startActivity(intentradio_button);
                break;

            case R.id.snack_bar:
                Intent intentsnack_bar = new Intent(ListActivity.this,SnackBarActivity.class);
                startActivity(intentsnack_bar);
                break;

            case R.id.switch_button:
                Intent intentswitch_button = new Intent(ListActivity.this,SwitchActivity.class);
                startActivity(intentswitch_button);
                break;

            case R.id.text:
                Intent intenttext = new Intent(ListActivity.this,TextActivity.class);
                startActivity(intenttext);
                break;

            case R.id.view_pager:
                Intent intentview_pager = new Intent(ListActivity.this,ViewPagerActivity.class);
                startActivity(intentview_pager);
                break;

            case R.id.login_registration:
                Intent intentlogin_registration = new Intent(ListActivity.this,MainActivity.class);
                startActivity(intentlogin_registration);
                break;
        }
    }
}
