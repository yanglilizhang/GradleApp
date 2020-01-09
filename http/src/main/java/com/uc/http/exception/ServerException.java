package com.uc.http.exception;

public class ServerException extends RuntimeException {
    private int code;
    private String message;

    public ServerException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}