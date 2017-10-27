package com.wonongyun.awl.awl_wonongyun.glide;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wonongyun.awl.awl_wonongyun.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by AWL on 2017/10/26.
 */

public class GlideActivity extends Activity {

    @BindView(R.id.btn_upload_pic)
    Button btnUploadPic;
    @BindView(R.id.iv_upload_pic)
    ImageView ivUploadPic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_upload_pic)
    public void onViewClicked() {
        // TODO: 2017/10/26 加载图片
        uploadPic();
    }

    private void uploadPic(){
        //.placeholder(R.drawable.loading)
        String url = "http://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1509606622&di=c839ba5648343143adc894f9ad68b6b5&imgtype=jpg&src=http%3A%2F%2Fimg6.bdstatic.com%2Fimg%2Fimage%2Fpublic%2Fliuling.jpg";
//        String url = "http://p1.pstatp.com/large/166200019850062839d3";
        Glide.with(this).load(url).placeholder(R.drawable.loading).crossFade(5000).error(R.drawable.error).diskCacheStrategy(DiskCacheStrategy.NONE).into(ivUploadPic);
    }
}
