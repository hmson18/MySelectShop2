package com.sparta.myselectshop2.exception;

public class ApiRequestException extends IllegalArgumentException {
    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
