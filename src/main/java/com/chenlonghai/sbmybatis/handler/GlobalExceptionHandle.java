package com.chenlonghai.sbmybatis.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

//统一的异常处理类
@ControllerAdvice
public class GlobalExceptionHandle {
	
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public Map<String,Object> exceptionHandler(HttpServletRequest req, Exception e){
		Map<String,Object>resultMap = new HashMap<String,Object>();
		resultMap.put("success", false);
		resultMap.put("errMsg", e.getMessage());
		return resultMap;
	}
	
	
}
