package com.wonongyun.awl.awl_wonongyun.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.wonongyun.awl.awl_wonongyun.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by AWL on 2017/10/26.
 */

public class TwoActivity extends Activity {

    @BindView(R.id.tv_two)
    TextView tvTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ButterKnife.bind(this);
    }
}
