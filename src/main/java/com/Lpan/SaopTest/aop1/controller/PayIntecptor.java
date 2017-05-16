package com.Lpan.SaopTest.aop1.controller;

import org.aopalliance.intercept.MethodInterceptor;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PayIntecptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		String name = invocation.getMethod().getName();
		System.out.println(name);
		Object[] arguments = invocation.getArguments();
		System.out.println(arguments[0]);
		String ss = "hello"+invocation.getArguments()[0].toString();
		System.out.println(ss);
		Object proceed = invocation.proceed();
		return proceed;
	}

}
