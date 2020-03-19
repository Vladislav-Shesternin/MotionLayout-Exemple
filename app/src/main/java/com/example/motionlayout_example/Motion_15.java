package com.example.motionlayout_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.motion.widget.TransitionAdapter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Motion_15 extends AppCompatActivity implements MotionLayout.TransitionListener {

    Button btn_15_1;
    MotionLayout motionLayout_15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_15);

        btn_15_1 = findViewById(R.id.btn_15_1);
        motionLayout_15 = findViewById(R.id.motionLayout_15);
//Назначаем слушатель для motionLayout_15
        motionLayout_15.setTransitionListener(this);
//Чтоби не implementing OnClickListener будет использоватся метод с ОБЕЗАТЕЛЬНЫМИ аргументами (View view)
        btn_15_1.setOnClickListener(this::start);
    }

    public void start(View v) {
        motionLayout_15.transitionToEnd();
    }

    @Override
    public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {

    }

    //TODO hello
    @Override
    public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {
        System.err.println("startId = " + startId + "endId = " + endId + "progress = " + progress);
    }

    @Override
    public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
        if (currentId == R.id.end) {
            motionLayout_15.transitionToStart();
        }
    }

    @Override
    public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {

    }
}
