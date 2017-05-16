package com.Lpan.SaopTest.aop1.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointAdvice2 {
	
	@Before("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void before(JoinPoint p){
		 System.out.println("----------前置通知----------");
	     System.out.println(p.getSignature().getName());
	}
	
	@After("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void after(JoinPoint p){
		 System.out.println("----------最终通知----------");
	}
	
	@Around("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public Object around(ProceedingJoinPoint  p){
		System.out.println("=======环绕前==========");
		Object proceed= 0;
		try {
			proceed = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("========环绕后==========");
		return proceed;
	}
	
	@AfterReturning("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void afterfinish(JoinPoint p){
		System.out.println("========方法成功执行后=======");
	}
	
	@AfterThrowing("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void afterexcept(JoinPoint p){
		System.out.println("========方法异常时执行=======");
	}
}
