package com.example.demo.until;

import com.example.demo.entity.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxType {
    private String code;
    private boolean success;
    private String msg;
    private Object data;
    public static AjaxType ok() {
        return new AjaxType(ResponseEnum.SUCCESS.getCode(), true, ResponseEnum.SUCCESS.getMsg(), "");
    }

    public static AjaxType ok(String msg) {
        return new AjaxType(ResponseEnum.SUCCESS.getCode(), true, msg, "");
    }

    public static AjaxType ok(Object data) {
        return new AjaxType(ResponseEnum.SUCCESS.getCode(), true, ResponseEnum.SUCCESS.getMsg(), data);
    }

    public static AjaxType error() {
        return new AjaxType(ResponseEnum.FAIL.getCode(), false, ResponseEnum.FAIL.getMsg(), "");
    }

    public static AjaxType error(String msg) {
        return new AjaxType(ResponseEnum.FAIL.getCode(), false, msg, "");
    }

    public static AjaxType error(Object data) {
        return new AjaxType(ResponseEnum.FAIL.getCode(), false, ResponseEnum.FAIL.getMsg(), data);
    }

    public static AjaxType error(String code, String msg) {
        return new AjaxType(code, false, msg, "");
    }

    public static AjaxType error(String msg,Object data) {
        return new AjaxType(ResponseEnum.FAIL.getCode(), false,msg, data);
    }

}
