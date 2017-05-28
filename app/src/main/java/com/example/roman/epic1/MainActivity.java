package com.example.roman.epic1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.example.roman.epic1.R.id.bt_for_employer;
import static com.example.roman.epic1.R.id.bt_for_worker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton mBtForWorker;
    ImageButton mBtForEmployer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtForWorker = (ImageButton)findViewById(bt_for_worker);
        mBtForWorker.setOnClickListener(this);
        mBtForEmployer = (ImageButton)findViewById(bt_for_employer);
        mBtForEmployer.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case bt_for_worker:
                Intent intent = new Intent(this, CurrentStatusActivity.class);
                startActivity(intent);
                break;
            case bt_for_employer:
                Toast.makeText(this, "EmployerActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
