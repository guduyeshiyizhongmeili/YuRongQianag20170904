package com.bwie.test;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MyView myView;
    private Button chance,jia,jian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (MyView) findViewById(R.id.myview);
        chance = (Button) findViewById(R.id.chacecolor);
        jia = (Button) findViewById(R.id.jia);
        jian = (Button) findViewById(R.id.jian);
        addanim();
        chance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jiaaddanim();
            }
        });
    }

    private void addanim() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(myView, "rotation", 0f, 360f);
        anim.setDuration(10000);
        anim.setRepeatCount(Integer.MAX_VALUE);
        anim.start();
    }

    private void jiaaddanim() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(myView, "rotation", 0f, 100f, 200, 280, 360f);
        anim.setDuration(10000);
        anim.setRepeatCount(Integer.MAX_VALUE);
        anim.start();
    }

    private void jianaddanim() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(myView, "rotation", 0f, 360f);
        anim.setDuration(10000);
        anim.setRepeatCount(Integer.MAX_VALUE);
        anim.start();
    }
}
