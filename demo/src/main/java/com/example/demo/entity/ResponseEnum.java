package com.example.demo.entity;

public enum ResponseEnum {
    SUCCESS("200", "success"),
    FAIL("500", "未知异常，请联系管理员"),
    NO_LOGIN("-1", "登录失效，请重新登录"),
    NO_PERMISSION("2", "没有权限禁止访问");

    private String code;
    private String msg;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
