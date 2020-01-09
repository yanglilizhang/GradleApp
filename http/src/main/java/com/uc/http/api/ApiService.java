package com.uc.http.api;

import com.uc.http.base.RespData;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    /**
     * 获取验证码 base64 （不带宽高）
     */
    @GET("captcha/base64")
    Single<RespData<String>> getVerifyCode(@Query("captcha_type") String captchaType);


}
