package com.java.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    ERROR_RESPONSE(1, "响应错误");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
