package com.fd.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zxq
 * @date ：Created in 2019/9/9 17:07
 *
 * 用于捕获全局异常
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     *  处理异常方法
     * @return Map
     *
     * 捕获运行时异常，返回json
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errorMsg", "系統错误!");
        return map;
    }
}
