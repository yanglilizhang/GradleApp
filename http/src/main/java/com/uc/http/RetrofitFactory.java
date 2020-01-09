package com.uc.http;

import com.uc.http.api.ApiService;
import com.uc.http.config.NetConfig;

public class RetrofitFactory {

    private static final Object LOCK = new Object();

    private static volatile ApiService apiService;

    public static ApiService getApiService() {
        if (apiService == null) {
            synchronized (LOCK) {
                if (apiService == null) {
                    String domain = NetConfig.getBaseUrl();
                    apiService =
                            new RetrofitHelper(domain, OkHttpHelper.getOkHttpInstance())
                                    .create(ApiService.class);
                }
            }
        }
        return apiService;

    }

    public static ApiService getApiService(String domain) {
        if (apiService == null) {
            synchronized (LOCK) {
                if (apiService == null) {
                    domain = NetConfig.getBaseUrl(domain);
                    apiService =
                            new RetrofitHelper(domain, OkHttpHelper.getOkHttpInstance())
                                    .create(ApiService.class);
                }
            }
        }
        return apiService;

    }

    public static void clear() {
        apiService = null;
    }


}
