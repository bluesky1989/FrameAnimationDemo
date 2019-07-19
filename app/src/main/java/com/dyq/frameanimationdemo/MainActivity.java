package com.dyq.frameanimationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_pic;
    private Button btn_start_play,btn_stop_play;

    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setListener();
        initAnim();



    }

    private void initAnim() {
        iv_pic.setImageResource(R.drawable.pikaqiu);
        animationDrawable= (AnimationDrawable) iv_pic.getDrawable();

    }

    private void initView() {
        iv_pic=findViewById(R.id.iv_pic);
        btn_start_play=findViewById(R.id.btn_start_play);
        btn_stop_play=findViewById(R.id.btn_stop_play);
    }

    private void setListener() {
        //开始帧动画
        btn_start_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();

            }
        });


        //暂停帧动画
        btn_stop_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
            }
        });

    }


}
