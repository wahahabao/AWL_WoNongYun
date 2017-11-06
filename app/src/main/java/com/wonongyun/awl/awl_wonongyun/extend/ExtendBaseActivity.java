package com.wonongyun.awl.awl_wonongyun.extend;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by AWL on 2017/10/30.
 */

public  class  ExtendBaseActivity extends Activity {

    public  void toast(){
        Toast.makeText(this,"这是BaseActivity",Toast.LENGTH_SHORT).show();
    }
}
