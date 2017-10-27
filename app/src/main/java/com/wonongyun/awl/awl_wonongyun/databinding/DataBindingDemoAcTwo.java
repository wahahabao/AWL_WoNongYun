package com.wonongyun.awl.awl_wonongyun.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.wonongyun.awl.awl_wonongyun.R;
import com.wonongyun.awl.awl_wonongyun.databinding.ActivityDatabindingtwoBinding;
import com.wonongyun.awl.awl_wonongyun.databinding.model.DataBindingTwoModel;

/**
 * Created by AWL on 2017/10/27.
 */

public class DataBindingDemoAcTwo extends Activity {

    String url = "http://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1509606622&di=c839ba5648343143adc894f9ad68b6b5&imgtype=jpg&src=http%3A%2F%2Fimg6.bdstatic.com%2Fimg%2Fimage%2Fpublic%2Fliuling.jpg";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDatabindingtwoBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_databindingtwo);
        DataBindingTwoModel datatwo = new DataBindingTwoModel();
        datatwo.depart = "software";
        datatwo.Man = "Jack";
        datatwo.ManAge = 27;
        datatwo.btnName = "加载一张图片";
        binding.setWxfawl(datatwo);
    }

    public void onClick_upload_pic(View v){
        Toast.makeText(this,"ImageView控件还没添加,功能暂未开通，敬请期待！",Toast.LENGTH_SHORT).show();
    }
}
