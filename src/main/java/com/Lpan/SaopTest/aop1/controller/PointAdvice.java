package com.Lpan.SaopTest.aop1.controller;

import org.aspectj.lang.JoinPoint;

public class PointAdvice {
	
	public void before(JoinPoint p){
		System.out.println("===========前置通知==========");
		System.out.println(p.getSignature().getName());
	}
	
	public void after(JoinPoint p){
		System.out.println("==========后通知============");
	}
	
}
