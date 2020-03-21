package com.example.motionlayout_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Motion_07 extends AppCompatActivity implements View.OnClickListener {

    MotionLayout motionLayout_07;
    EditText edit_1, edit_2;
    Button btn_1;

    int set1, set2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_07);

        motionLayout_07 = findViewById(R.id.motion_layout_07);
        edit_1 = findViewById(R.id.edit_07_1);
        edit_2 = findViewById(R.id.edit_07_2);
        btn_1 = findViewById(R.id.btn_1);

        set1 = R.id.no_07;
        set2 = R.id.yes_07;

        btn_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text = edit_2.getText().toString();
        if (text.equals("0123456789")) {
            motionLayout_07.setTransition(set2, set2);
            motionLayout_07.transitionToEnd();
        } else {
            motionLayout_07.setTransition(set1, set1);
            motionLayout_07.transitionToEnd();
        }
    }
}
