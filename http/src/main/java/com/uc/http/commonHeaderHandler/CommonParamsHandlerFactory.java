package com.uc.http.commonHeaderHandler;

import com.uc.http.commonHeaderHandler.handler.BaseHandler;
import com.uc.http.commonHeaderHandler.handler.TyCommonHeadHandler;

public class CommonParamsHandlerFactory {

    /**
     * 获取处理链
     *
     * @return 返回处理链
     */
    public static BaseHandler getHandler() {
        return new TyCommonHeadHandler();
    }

}