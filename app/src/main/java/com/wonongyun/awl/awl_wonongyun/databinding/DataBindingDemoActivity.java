package com.wonongyun.awl.awl_wonongyun.databinding;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.wonongyun.awl.awl_wonongyun.R;
import com.wonongyun.awl.awl_wonongyun.databinding.model.user;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by AWL on 2017/10/27.
 */

public class DataBindingDemoActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDatabindingdemoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_databindingdemo);
        //这个名字坑我相当一段时间，ActivityDatabindingdemoBinding 这个是自动生成的，根据布局文件activity_databindingdemo.xml的名字activity_databindingdemo，加上Binding
        user mu = new user();
        mu.name = "wwwww";
        mu.phone = "fwfwfw";
        binding.setAwl(mu);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent intent = new Intent();
        intent.setClass(this,DataBindingDemoAcTwo.class);
        startActivity(intent);
    }

}
