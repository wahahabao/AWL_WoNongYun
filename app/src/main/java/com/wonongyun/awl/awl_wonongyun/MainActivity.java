package com.wonongyun.awl.awl_wonongyun;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @Bind(R.id.btn_count)
    Button btn_count;
    @Bind(R.id.tv_showCount)
    TextView tv_showCount;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_count, R.id.tv_showCount})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_count) {
            tv_showCount.setText("次数："+i);
//            tv_showCount.setText(i);
            i++;
        } else if (id == R.id.tv_showCount) {
            Toast.makeText(this,"textview",Toast.LENGTH_SHORT).show();
        }
    }
}
