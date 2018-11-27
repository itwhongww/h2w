package com.wax.h2w.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * aop拦截设置本地线程变量
 * 
 * @author maoyl05
 *
 */
@Aspect
@Order(1)
@Component
public class DataSourceAop {
	private static Logger log = LoggerFactory.getLogger(DataSourceAop.class);
	
	@Before("@annotation(com.wax.h2w.config.annotation.Read)")
	public void setReadDataSourceType() {
		DataSourceContextHolder.change2Read();
	}
	
	@Before("@annotation(com.wax.h2w.config.annotation.Write))")
	public void setWriteDataSourceType() {
		DataSourceContextHolder.change2Write();
	}
}
