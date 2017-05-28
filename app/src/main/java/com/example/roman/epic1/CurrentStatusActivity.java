package com.example.roman.epic1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.roman.epic1.R.id.bt_I_am_already_in_poland;
import static com.example.roman.epic1.R.id.bt_I_do_not_have_foreign_passport;
import static com.example.roman.epic1.R.id.bt_I_do_not_have_work_visa;
import static com.example.roman.epic1.R.id.bt_I_have_no_job;
//import static com.example.roman.epic1.R.id.bt_for_employer;
//import static com.example.roman.epic1.R.id.bt_for_worker;

public class CurrentStatusActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtNoPass;
    Button mBtNoVisa;
    Button mBtNoWork;
    Button mBtIamAlreadyInPoland;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_status);

        mBtNoPass = (Button) findViewById(bt_I_do_not_have_foreign_passport);
        mBtNoPass.setOnClickListener((View.OnClickListener) this);
        mBtNoVisa = (Button) findViewById(bt_I_do_not_have_work_visa);
        mBtNoVisa.setOnClickListener((View.OnClickListener) this);
        mBtNoWork = (Button) findViewById(bt_I_have_no_job);
        mBtNoWork.setOnClickListener((View.OnClickListener) this);
        mBtIamAlreadyInPoland = (Button) findViewById(bt_I_am_already_in_poland);
        mBtIamAlreadyInPoland.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case bt_I_do_not_have_foreign_passport:
                intent = new Intent(CurrentStatusActivity.this, PassExecutionActivity.class);
                startActivity(intent);
                break;
            case bt_I_do_not_have_work_visa:
                intent = new Intent(CurrentStatusActivity.this, TypeOfVisaActivity.class);
                startActivity(intent);
                break;
            case bt_I_have_no_job:
                Toast.makeText(this, "JobActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            case bt_I_am_already_in_poland:
                Toast.makeText(this, "IamInPolandActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
