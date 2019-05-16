package com.java.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVo implements Serializable {

    private static final long serialVersionUID = 2762153850491261034L;

    private Integer code;

    private ResultVoMsg msg;
}
