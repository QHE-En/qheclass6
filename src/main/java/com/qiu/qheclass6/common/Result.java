package com.qiu.qheclass6.common;

/**
 * 统一返回结果
 * 所有接口都返回这个格式，前端处理起来只有一套逻辑
 */
public class Result<T> {

    private Integer code;   // 状态码：200 成功，500 失败
    private String msg;     // 提示语
    private T data;         // 数据。查询接口用它装数据，增删改填 null

    // 成功 + 带数据（查询用）
    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.code = 200;
        r.msg = "成功";
        r.data = data;
        return r;
    }

    // 成功 + 不带数据（新增、修改、删除用）
    public static <T> Result<T> success() {
        return success(null);
    }

    // 失败
    public static <T> Result<T> error(String msg) {
        Result<T> r = new Result<>();
        r.code = 500;
        r.msg = msg;
        return r;
    }

    public Integer getCode() { return code; }
    public void setCode(Integer code) { this.code = code; }

    public String getMsg() { return msg; }
    public void setMsg(String msg) { this.msg = msg; }

    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}
