package com.uc.http.interceptor;

import com.uc.http.commonHeaderHandler.CommonParamsHandlerFactory;
import com.uc.http.commonHeaderHandler.handler.BaseHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class CommonParamsInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder requestBuilder = request.newBuilder();

        rebuildHeader(request, requestBuilder);
        rebuildParams(request, requestBuilder);

        request = requestBuilder.build();

        return chain.proceed(request);
    }

    /**
     * 创建新的头部参数
     *
     * @param oldRequest     旧请求
     * @param requestBuilder 重构
     */
    private void rebuildHeader(Request oldRequest, Request.Builder requestBuilder) {
        if (oldRequest == null) {
            return;
        }

        Headers.Builder headerBuilder = oldRequest.headers().newBuilder();

        // 获取头参处理链，进行处理
        Map<String, String> headerParams = new HashMap<>();
        BaseHandler handler = CommonParamsHandlerFactory.getHandler();
        handler.getHeaderParams(oldRequest, headerParams);

        for (Map.Entry<String, String> entry : headerParams.entrySet()) {
            headerBuilder.add(entry.getKey(), entry.getValue());
        }
        requestBuilder.headers(headerBuilder.build());

    }


    private void rebuildParams(Request oldRequest, Request.Builder requestBuilder) {

    }




}
