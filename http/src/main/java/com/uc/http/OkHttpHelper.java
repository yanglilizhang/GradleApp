package com.uc.http;

import com.uc.http.config.NetConfig;
import com.uc.http.cookie.CookieJarImpl;
import com.uc.http.cookie.PersistentCookieStore;
import com.uc.http.interceptor.CommonParamsInterceptor;
import com.uc.http.interceptor.LogInterceptor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 提供 OkHttpClient
 */
public class OkHttpHelper {

    private static final Object lock = new Object();
    private volatile static OkHttpClient okHttpClient;

    public static OkHttpClient getOkHttpInstance() {
        if (okHttpClient == null) {
            synchronized (lock) {
                if (okHttpClient == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    okHttpClient = builder
                            .connectTimeout(NetConfig.CONNECT_TIME_OUT, TimeUnit.SECONDS)
                            .readTimeout(NetConfig.READ_TIME_OUT, TimeUnit.SECONDS)
                            .writeTimeout(NetConfig.WRITE_TIME_OUT, TimeUnit.SECONDS)
                            .addInterceptor(new CommonParamsInterceptor())
                            .addInterceptor(new LogInterceptor())
                            .addInterceptor(new Interceptor() {
                                @Override
                                public Response intercept(Chain chain) throws IOException {
                                    Request request = chain.request()
                                            .newBuilder()
                                            .removeHeader("User-Agent")
                                            .addHeader("User-Agent", "android")
                                            .build();
                                    return chain.proceed(request);
                                }
                            })
                            .cookieJar(new CookieJarImpl(PersistentCookieStore.getInstance()))
                            .build();
                }
            }
        }
        return okHttpClient;
    }


}
