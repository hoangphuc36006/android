package com.deptrai.phucnguyen.bt2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mTvLogin;
    TextView mTvCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvCancel = findViewById(R.id.tvCancel);
        mTvLogin = findViewById(R.id.tvDone);
        mTvCancel.setText(getString(R.string.tv_change));

        mTvCancel.setOnClickListener(this);
        mTvLogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvCancel:
                Toast.makeText(this, "1211233", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvDone :
                Intent profile = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(profile);
                finish();
                break;
        }

    }
}
