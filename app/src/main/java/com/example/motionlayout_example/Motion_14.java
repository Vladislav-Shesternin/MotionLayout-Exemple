package com.example.motionlayout_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.TransitionAdapter;

import android.os.Bundle;
import android.widget.TextView;

public class Motion_14 extends AppCompatActivity {

    MotionLayout scene14;
    TextView mNumTop, mNumBottom;
    int start, like, pass, offScreenLike, offScreenPass, numTop, numBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_14);

        scene14 = findViewById(R.id.motion_layout_14);
        mNumTop = findViewById(R.id.tv_number_top);
        mNumBottom = findViewById(R.id.tv_number_bottom);
        start = R.id.start;
        like = R.id.like;
        pass = R.id.pass;
        offScreenLike = R.id.offScreenLike;
        offScreenPass = R.id.offScreenPass;
        numTop = 2;
        numBottom = 3;

        scene14.setTransitionListener(new TransitionAdapter() {
            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
                super.onTransitionCompleted(motionLayout, currentId);
                if (currentId == offScreenLike || currentId == offScreenPass) {
                    mNumTop.setText(numTop+"");
                    mNumBottom.setText(numBottom+"");
                    numTop++;
                    numBottom++;
                }
            }
        });

    }
}
