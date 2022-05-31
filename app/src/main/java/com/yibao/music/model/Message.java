package com.yibao.music.model;


public class Message {
    private int code;
    private String msgKey;
    private Object object;

    public Message(String msgKey, Object object) {
        this.msgKey = msgKey;
        this.object = object;
    }

    public Message() {
    }

    public Message(int code, Object o) {
        this.code = code;
        this.object = o;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }
}
