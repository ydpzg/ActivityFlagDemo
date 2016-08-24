package com.dukelight.activityflagdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 如何跳转页面,然后清空activity栈
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTvActivity;
    private Button mBtnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvActivity = (TextView) findViewById(R.id.tv_activity);
        mBtnJump = (Button) findViewById(R.id.btn_jump);

        mTvActivity.setText("MainActivity");

        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });
    }

    private void jump() {
        Intent intent = new Intent(this, TestActivity2.class); //
        startActivity(intent);
    }
}
