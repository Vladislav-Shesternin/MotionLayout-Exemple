package com.example.motionlayout_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Motion_15 extends AppCompatActivity {

    Button btn_15_1;
    MotionLayout motionLayout_15;
    int set1, set2, set3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_15);

        set1 = R.id.set1;
        set2 = R.id.set2;
        set3 = R.id.set3;

        btn_15_1 = findViewById(R.id.btn_15_1);
        motionLayout_15 = findViewById(R.id.motionLayout_15);

//TODO Чтоби не implementing OnClickListener будет использоватся метод с ОБЕЗАТЕЛЬНЫМИ аргументами (View view)
        btn_15_1.setOnClickListener(this::start);
    }

    public void start(View v) {
        if (motionLayout_15.getCurrentState() == set1) {
            motionLayout_15.setTransition(set1, set2);
            motionLayout_15.setTransitionDuration(3000);
            motionLayout_15.transitionToEnd();
        } else if (motionLayout_15.getCurrentState() == set2) {
            motionLayout_15.transitionToState(set3);
            motionLayout_15.setTransitionDuration(3000);
            motionLayout_15.transitionToEnd();
        } else {
            motionLayout_15.setTransition(set3, set1);
            motionLayout_15.setTransitionDuration(3000);
            motionLayout_15.transitionToEnd();
        }
    }
}