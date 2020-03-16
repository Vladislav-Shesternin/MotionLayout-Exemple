package com.example.motionlayout_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button
            mBtn1, mBtn2, mBtn3,
            mBtn4, mBtn5, mBtn6,
            mBtn7, mBtn8, mBtn9,
            mBtn10, mBtn11, mBtn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn1 = findViewById(R.id.btn_01);
        mBtn2 = findViewById(R.id.btn_02);
        mBtn3 = findViewById(R.id.btn_03);
        mBtn4 = findViewById(R.id.btn_04);
        mBtn5 = findViewById(R.id.btn_05);
        mBtn6 = findViewById(R.id.btn_06);
        mBtn7 = findViewById(R.id.btn_07);
        mBtn8 = findViewById(R.id.btn_08);
        mBtn9 = findViewById(R.id.btn_09);
        mBtn10 = findViewById(R.id.btn_10);
        mBtn11 = findViewById(R.id.btn_11);
        mBtn12 = findViewById(R.id.btn_12);

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);
        mBtn7.setOnClickListener(this);
        mBtn8.setOnClickListener(this);
        mBtn9.setOnClickListener(this);
        mBtn10.setOnClickListener(this);
        mBtn11.setOnClickListener(this);
        mBtn12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_01:
                intent = new Intent(this, Motion_01.class);
                break;
            case R.id.btn_02:
                intent = new Intent(this, Motion_02.class);
                break;
            case R.id.btn_03:
                intent = new Intent(this, Motion_03.class);
                break;
            case R.id.btn_04:
                intent = new Intent(this, Motion_04.class);
                break;
            case R.id.btn_05:
                intent = new Intent(this, Motion_05.class);
                break;
            case R.id.btn_06:
                intent = new Intent(this, Motion_06.class);
                break;
            case R.id.btn_07:
                intent = new Intent(this, Motion_07.class);
                break;
            case R.id.btn_08:
                intent = new Intent(this, Motion_08.class);
                break;
            case R.id.btn_09:
                intent = new Intent(this, Motion_09.class);
                break;
            case R.id.btn_10:
                intent = new Intent(this, Motion_10.class);
                break;
            case R.id.btn_11:
                intent = new Intent(this, Motion_11.class);
                break;
            case R.id.btn_12:
                intent = new Intent(this, Motion_12.class);
                break;
        }
        startActivity(intent);
    }
}