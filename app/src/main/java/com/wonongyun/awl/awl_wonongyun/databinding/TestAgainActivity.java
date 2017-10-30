package com.wonongyun.awl.awl_wonongyun.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wonongyun.awl.awl_wonongyun.R;
import com.wonongyun.awl.awl_wonongyun.databinding.model.TestAgain;

public class TestAgainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test_again);
        ActivityTestAgainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_test_again);
        TestAgain testAgain = new TestAgain();
        testAgain.setName("铜");
        testAgain.setKind("金属");
        testAgain.setPrice("40000");
        testAgain.setBtnContent("点击测试监听事件");
        com.wonongyun.awl.awl_wonongyun.databinding.TestAgain testAgain1 = new com.wonongyun.awl.awl_wonongyun.databinding.TestAgain();
        testAgain1.setProduct("江苏泰州");
        testAgain1.setUsTime(8);
        binding.setTestwxf(testAgain);
        binding.setWxfBieming(testAgain1);
        binding.setWxfOnClickL(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TAG","测试成功");
            }
        });
    }
}
