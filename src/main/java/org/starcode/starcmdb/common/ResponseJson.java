package org.starcode.starcmdb.common;

/**
 * 作者:angie_hawk7
 * 日期:2018/6/30 19:59
 * 描述:数据返回结构
 */
public class ResponseJson {
    //业务返回码
    private String code;
    //业务返回码描述
    private String msg;
    //业务返回数据
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
