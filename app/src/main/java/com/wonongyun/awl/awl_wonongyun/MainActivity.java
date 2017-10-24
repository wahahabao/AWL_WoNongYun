package com.wonongyun.awl.awl_wonongyun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("测试commit and push","点击一下");
        Log.i("测试user.name email","点击一下");
    }
}
