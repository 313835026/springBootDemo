package com.wsdll.errorutil;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

// 全局捕获异常
@ControllerAdvice
public class GlobalExceptionHandler {

    // 运行时异常
    @ExceptionHandler(RuntimeException.class)
    // 转json
    @ResponseBody
    public Map<String, Object> resultError() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("errorCode", "500");
        resultMap.put("errorMsg", "系统错误");
        return resultMap;
    }
}
