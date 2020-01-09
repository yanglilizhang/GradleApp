package com.uc.http.config;

import androidx.annotation.NonNull;

public class NetConfig {

    public final static int CONNECT_TIME_OUT = 30;
    public final static int READ_TIME_OUT = 30;
    public final static int WRITE_TIME_OUT = 30;
    // 测试数据源
    public final static String CHECK_DATA_SOURCE_URL = "article/category";
    // 文章
//    public final static String ARTICLE_URL = "/api/pages/article_info?article_id=";
    public final static String ARTICLE_URL = "/api/pages/article/";
    private final static String PREFIX = "/api/";

    /**
     * 获取带版本的url
     */
    public static String getBaseUrl() {
//        if (NetCache.isEmpty()) {
            return "http://error/";
//        }

//        return getFormatUrl(NetCache.getDefault().getDomain());
    }

    /**
     * 获取带版本的 url
     */
    public static String getBaseUrl(String domain) {
        return getFormatUrl(domain);
    }

    /**
     * 获取不带版本的 url
     */
    public static String getBaseUrlWithoutVersion() {
//        if (NetCache.isEmpty()) {
            return "http://error/";
//        }

//        return NetCache.getDefault().getDomain() + "/";
    }

    /**
     * 获取拼凑了版本的 url
     */
    private static String getFormatUrl(@NonNull String domain) {
//        return domain + PREFIX + BuildConfig.API_VERSION;
        return  "";
    }

    /**
     * 获取文章url前缀
     */
    public static String getArticleUrlPrefix() {
        return getBaseUrlWithoutVersion() + ARTICLE_URL;
    }
}
