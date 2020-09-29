package com.simplevat.product.exception;

public class ApplicationError {
    private int code;
    private String message;

    @Override
    public String toString() {
        return "ApplicationError{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
