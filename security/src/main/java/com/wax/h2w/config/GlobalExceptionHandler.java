package com.wax.h2w.config;

import com.wax.h2w.config.vo.Constants;
import com.wax.h2w.config.vo.ReturnInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 定义全局异常处理类
 * 
 * @author maoyl05
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	/**
	 * 默认处理Exception异常，返回json结果
	 * 
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ReturnInfo<String> defaultErrorHandler(HttpServletRequest req, Exception e) {
		ReturnInfo<String> r = new ReturnInfo<>();
		r.setMessage(e.getMessage());
		r.setCode(Constants.Code.ERROR);
		r.setData(Constants.Msg.FAIL);
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
}
