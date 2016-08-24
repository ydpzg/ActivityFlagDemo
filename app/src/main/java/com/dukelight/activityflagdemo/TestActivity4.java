package com.dukelight.activityflagdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by YDP on 16/8/25.
 */

public class TestActivity4 extends AppCompatActivity {

    private TextView mTvActivity;
    private Button mBtnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvActivity = (TextView) findViewById(R.id.tv_activity);
        mBtnJump = (Button) findViewById(R.id.btn_jump);

        mTvActivity.setText("TestActivity4");
        
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });
    }

    private void jump() {
        Intent intent = new Intent(this, MainActivity.class); //
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
