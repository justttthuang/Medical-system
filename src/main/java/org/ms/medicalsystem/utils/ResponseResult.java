package org.ms.medicalsystem.utils;


import lombok.Getter;

@Getter
public class ResponseResult<T> {
    private String code;
    private String msg;
    private T data;

    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(String code, String msg, Integer id) {
        this.code = code;
        this.msg = msg;
        this.id = id;
    }

    public ResponseResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(String code, String msg, T data, Integer id) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.id = id;
    }
}
