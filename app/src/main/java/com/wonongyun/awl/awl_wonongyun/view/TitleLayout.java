package com.wonongyun.awl.awl_wonongyun.view;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wonongyun.awl.awl_wonongyun.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by AWL on 2017/11/6.
 * 自定义控件TitleLayout继承自LinearLayout
 */

public class TitleLayout extends LinearLayout {
    @BindView(R.id.btn_back)
    Button btnBack;
    @BindView(R.id.tv_text)
    TextView tvText;
    @BindView(R.id.btn_edit)
    Button btnEdit;

    public TitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.title__, this);
        ButterKnife.bind(this);//记得要绑定黄油刀，否则监听事件不起作用
    }

    @OnClick({R.id.btn_back, R.id.tv_text, R.id.btn_edit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                Log.i("tag",getContext().getString(R.string.btn_back1));
                ((Activity)getContext()).finish();//结束当前所在activity
                break;
            case R.id.tv_text:
                Log.i("tag",getContext().getString(R.string.tv_text));
                break;
            case R.id.btn_edit:
                Log.i("tag",getContext().getString(R.string.btn_edit));
                break;
        }
    }
}
