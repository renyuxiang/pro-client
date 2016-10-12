package com.ryx.server.Msg;

import java.io.Serializable;

/**
 * Created by ryx on 2016/10/10.
 */
public class Result implements Serializable{
    private Integer code;
    private Object obj;

    public Result() {
    }

    public Result(Integer code, Object obj) {
        this.code = code;
        this.obj = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
