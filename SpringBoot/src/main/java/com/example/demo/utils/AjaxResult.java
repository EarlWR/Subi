package com.example.demo.utils;

import java.util.HashMap;
import java.util.Objects;

public class AjaxResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    public static final String CODE_TAG = "code";
    public static final String MSG_TAG = "msg";
    public static final String DATA_TAG = "data";

    public AjaxResult() {
    }

    public AjaxResult(int code, String msg) {
        super.put("code", code);
        super.put("msg", msg);
    }

    public AjaxResult(int code, String msg, Object data) {
        super.put("code", code);
        super.put("msg", msg);
        if (!Objects.isNull(data)) {
            super.put("data", data);
        }

    }

    public static AjaxResult success() {
        return success("操作成功");
    }

    public static AjaxResult success(Object data) {
        return success("操作成功", data);
    }

    public static AjaxResult success(String msg) {
        return success(msg, (Object)null);
    }

    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(200, msg, data);
    }

    public static AjaxResult error() {
        return error("操作失败");
    }

    public static AjaxResult error(String msg) {
        return error(msg, (Object)null);
    }

    public static AjaxResult error(String msg, Object data) {
        return new AjaxResult(500, msg, data);
    }

    public static AjaxResult error(int code, String msg) {
        return new AjaxResult(code, msg, (Object)null);
    }

    public AjaxResult setStatus(int code) {
        super.put("code", code);
        return this;
    }

    public AjaxResult setMsg(String msg) {
        super.put("msg", msg);
        return this;
    }

    public int getCode() {
        Object var1 = super.get("code");
        return var1 == null ? 500 : Integer.valueOf(var1.toString());
    }

    public String getMessage() {
        Object var1 = super.get("msg");
        return var1 == null ? null : var1.toString();
    }

    public Object getData() {
        return super.get("data");
    }
}
