package com.example.roman.epic1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.example.roman.epic1.R.id.bt_for_need_help;
import static com.example.roman.epic1.R.id.bt_for_registration_your_self;

public class PassportExecutionActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton mBtForRegisterYourSelf;
    ImageButton mBtForNeedHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passport_execution);

        mBtForRegisterYourSelf = (ImageButton) findViewById(bt_for_registration_your_self);
        mBtForRegisterYourSelf.setOnClickListener(this);
        mBtForNeedHelp = (ImageButton) findViewById(bt_for_need_help);
        mBtForNeedHelp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case bt_for_registration_your_self:
                Toast.makeText(this, "YourSelfVisaRegistrationActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            case bt_for_need_help:
                Toast.makeText(this, "NeedHelpInVisaRegistrationActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}