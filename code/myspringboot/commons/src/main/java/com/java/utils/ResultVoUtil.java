package com.java.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();

        ResultVoMsg resultVoMsg = new ResultVoMsg();
        resultVoMsg.setData(object);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        resultVoMsg.setServerTime(sdf.format(new Date()));

        resultVo.setCode(200);
        resultVo.setMsg(resultVoMsg);

        return resultVo;
    }

    public static ResultVo error(Integer code, String error){
        ResultVo resultVo = new ResultVo();
        ResultVoMsg resultVoMsg = new ResultVoMsg();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        resultVoMsg.setServerTime(sdf.format(new Date()));
        resultVoMsg.setError(error);

        resultVo.setCode(200);
        resultVo.setMsg(resultVoMsg);

        return resultVo;
    }
}
