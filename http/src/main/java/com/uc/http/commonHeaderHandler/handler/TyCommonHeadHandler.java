package com.uc.http.commonHeaderHandler.handler;

import java.util.Map;

import okhttp3.Request;

public class TyCommonHeadHandler extends BaseHandler {

    @Override
    protected boolean isHandle(Request request, Map<String, String> headParams) {
        return true;
    }

    @Override
    protected void handle(Request request, Map<String, String> headerParams) {
//        headerParams.put(NetConfig.VERSION_NAME, BuildConfig.VERSION_NAME);

    }
}