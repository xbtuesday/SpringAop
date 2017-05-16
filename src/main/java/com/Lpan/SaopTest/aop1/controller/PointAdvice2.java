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
		 System.out.println("----------ǰ��֪ͨ----------");
	     System.out.println(p.getSignature().getName());
	}
	
	@After("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void after(JoinPoint p){
		 System.out.println("----------����֪ͨ----------");
	}
	
	@Around("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public Object around(ProceedingJoinPoint  p){
		System.out.println("=======����ǰ==========");
		Object proceed= 0;
		try {
			proceed = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("========���ƺ�==========");
		return proceed;
	}
	
	@AfterReturning("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void afterfinish(JoinPoint p){
		System.out.println("========�����ɹ�ִ�к�=======");
	}
	
	@AfterThrowing("execution(* com.Lpan.SaopTest.Utils.MathInt.*(..))")
	public void afterexcept(JoinPoint p){
		System.out.println("========�����쳣ʱִ��=======");
	}
}
