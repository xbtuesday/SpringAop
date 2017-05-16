package com.Lpan.SaopTest.aop1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Lpan.SaopTest.Utils.MathDouble;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop1.xml");
		MathDouble mathDouble = ac.getBean("math",MathDouble.class);
		double a = 2.34;
		double b = 1.89;
		mathDouble.adds(a, b);
		mathDouble.subtract(a, b);
		mathDouble.div(a, b, 2);
		mathDouble.multiply(1, b);
	}
	
}
