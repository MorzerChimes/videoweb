package com.videoweb.common;

import lombok.Data;

@Data
public class Result {
    //成功代码
    private static final String SUCCESS_CODE = "200";
    //失败代码
    private static final String ERROR_CODE = "-1";

    private String code;
    private String message;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }
    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }
    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMessage(msg);
        return result;
    }
}
