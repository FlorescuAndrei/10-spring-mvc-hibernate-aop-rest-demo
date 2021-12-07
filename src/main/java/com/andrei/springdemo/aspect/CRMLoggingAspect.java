package com.andrei.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	//setup logger (not necessarily(can use System.out.println), it is good to sync with spring messages. Spring use logger for its messages)
	private Logger logger = Logger.getLogger(getClass().getName());
	
	
	
	//setup pointcut declaration
	@Pointcut("execution(* com.andrei.springdemo.controller.*.*(..))")  //any class, any method, any number of arguments
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.andrei.springdemo.service.*.*(..))")  
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.andrei.springdemo.dao.*.*(..))") 
	private void forDAOPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow() {}
	
	
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		
		String method = joinPoint.getSignature().toShortString();
		logger.info("==========>>> in @Before: calling method: " + method);
		
		//display arguments to method
		
		Object[] args = joinPoint.getArgs();
		
		for(Object arg : args) {
			logger.info("==============>>> argument: "  + arg);
		}
		
	}
	
	@AfterReturning(pointcut="forAppFlow()",
					returning="theResult")
	public void afterReturning(JoinPoint joinPoint, Object theResult) {
		String method = joinPoint.getSignature().toShortString();
		logger.info("==========>>> in @AfterReturning: from method: " + method);
		
		logger.info("=============>>> result:" + theResult);
	}
	
}
