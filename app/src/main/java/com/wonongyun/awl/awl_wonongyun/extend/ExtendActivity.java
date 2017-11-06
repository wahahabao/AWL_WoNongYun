package com.wonongyun.awl.awl_wonongyun.extend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.wonongyun.awl.awl_wonongyun.R;

public class ExtendActivity extends ExtendBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend);
        toast();
    }
}
