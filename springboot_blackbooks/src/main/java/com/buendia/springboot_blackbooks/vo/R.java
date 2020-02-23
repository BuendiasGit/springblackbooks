package com.buendia.springboot_blackbooks.vo;

import lombok.Data;

@Data
public class R {

    private int code;
    private String msg;
    private Object data;

    public static R setR(int code,String msg,Object data){
        R r = new R();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }

    public static R ok(){
        R r = new R ();
        r.setCode(0);
        r.setMsg("");
        r.setData(null);
        return r;
    }

    public static R ok(String msg){
        R r = new R ();
        r.setCode(0);
        r.setMsg(msg);
        r.setData(null);
        return r;
    }

    public static R ok(Object data){
        R r = new R ();
        r.setCode(0);
        r.setMsg("");
        r.setData(data);
        return r;
    }

    public static R ok(String msg,Object data){
        R r = new R ();
        r.setCode(0);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static R fail(){
        R r = new R();
        r.setCode(1);
        r.setMsg("");
        r.setData(null);
        return r;
    }

    public static R fail(String msg){
        R r = new R();
        r.setCode(1);
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
}
