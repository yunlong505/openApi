package com.bowen.api.obapi.util;

public class ResultApi {
    public static int SUCCESS_CODE = 1000;
    public static int FAIL_CODE = 1001;

    private int code;
    private String msg;
    private Object data;

    private ResultApi(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultApi suc() {
        return new ResultApi(SUCCESS_CODE, null, null);
    }

    public static ResultApi suc(Object data) {
        return new ResultApi(SUCCESS_CODE, "操作成功", data);
    }

    public static ResultApi fail(String msg) {
        return new ResultApi(FAIL_CODE, msg, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
