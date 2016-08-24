package com.dukelight.activityflagdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by YDP on 16/8/25.
 */

public class TestActivity2 extends Activity {

    private TextView mTvActivity;
    private Button mBtnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvActivity = (TextView) findViewById(R.id.tv_activity);
        mBtnJump = (Button) findViewById(R.id.btn_jump);

        mTvActivity.setText("TestActivity2");

        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });
    }

    private void jump() {
        Intent intent = new Intent(this, TestActivity3.class); //
        startActivity(intent);
    }
}
