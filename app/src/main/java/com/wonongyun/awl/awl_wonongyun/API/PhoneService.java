package com.wonongyun.awl.awl_wonongyun.API;

import com.wonongyun.awl.awl_wonongyun.model.PhoneResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by AWL on 2017/10/25.
 */

public interface PhoneService {
    @GET("/mobile/get")
//    Call<PhoneResult> getResult(@Header("phone") String phone,@Query("dtype") String dtype,@Query("key") String apikey);
    Call<PhoneResult> getResult(@Query("phone") String phone,@Query("dtype") String dtype,@Query("key") String apikey);
}
