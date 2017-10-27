package com.wonongyun.awl.awl_wonongyun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wonongyun.awl.awl_wonongyun.API.PhoneService;
import com.wonongyun.awl.awl_wonongyun.databinding.DataBindingDemoActivity;
import com.wonongyun.awl.awl_wonongyun.glide.GlideActivity;
import com.wonongyun.awl.awl_wonongyun.model.PhoneResult;
import com.wonongyun.awl.awl_wonongyun.ui.activity.TwoActivity;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {

    @BindView(R.id.click)
    Button click;
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.edit_user)
    EditText phoneView;
    @BindView(R.id.btn_toTwoActivity)
    Button btnToTwoActivity;

    private static final String BASE_URL = "http://apis.juhe.cn";
    private static final String API_KEY = "c806db10ebb140cc90395ad429129517";
    private static final String dtype = "";
    @BindView(R.id.btn_to_glideAc)
    Button btnToGlideAc;
    @BindView(R.id.btn_to_databindingdemo)
    Button btnToDatabindingdemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.click)
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.click) {
            // TODO: 2017/10/25  点击Query按钮开始网络请求
            Log.i("TAG", "onClick");
            query();
        }
    }

    /**
     * 网络请求
     */
    private void query() {
        //打印网络请求日志HttpLoggingInterceptor、OkHttpClient、retrofit.client(client)
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                //打印retrofit日志
                Log.i("RetrofitLog", "retrofitBack = " + message);
            }
        });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
//                .cache(cache)
                .addInterceptor(loggingInterceptor)
                .connectTimeout(10000, TimeUnit.SECONDS)
                .readTimeout(10000, TimeUnit.SECONDS)
                .writeTimeout(10000, TimeUnit.SECONDS)
                .build();

        //1.创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())//解析方法
                .baseUrl(BASE_URL)//主机地址
                .client(client)
                .build();
        //2.创建访问API的请求
        PhoneService service = retrofit.create(PhoneService.class);
        Call<PhoneResult> call = service.getResult(phoneView.getText().toString(), dtype, API_KEY);
        //3.发送请求
        call.enqueue(new Callback<PhoneResult>() {
            @Override
            public void onResponse(Call<PhoneResult> call, Response<PhoneResult> response) {
                //4.处理结果
                if (response.isSuccessful()) {
                    PhoneResult result = response.body();
                    if (result != null) {
                        PhoneResult.ResultEntity entity = result.getResult();
                        try {
                            tv.setText(result.getReason() + ":" + entity.getProvince() + entity.getCity());
                        } catch (Exception e) {
                            Log.i("TAG", "号码输入有误");
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<PhoneResult> call, Throwable t) {
                Log.i("TAG", "网络请求onFailure");
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @OnClick(R.id.btn_toTwoActivity)
    public void onViewClicked() {
        Intent intent = new Intent();
        intent.setClass(this, TwoActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_to_glideAc)
    public void onViewClicked1() {
        Intent intent = new Intent();
        intent.setClass(this, GlideActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_to_databindingdemo)
    public void onViewClicked2() {
        Intent intent = new Intent();
        intent.setClass(this, DataBindingDemoActivity.class);
        startActivity(intent);
    }
}
