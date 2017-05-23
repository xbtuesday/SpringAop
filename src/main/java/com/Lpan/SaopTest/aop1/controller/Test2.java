package com.Lpan.SaopTest.aop1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Lpan.SaopTest.Utils.MathInt;

public class Test2 {
	public static void main(String[] args) throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/aop2.xml");
		MathInt mathInt = ac.getBean("mathint",MathInt.class);
		int a = 2;
		int b = 0;
		int add = mathInt.add(a, b);
		System.out.println(add);
		int sub = mathInt.sub(a, b);
		System.out.println(sub);
		int d= mathInt.div(a, b);
		System.out.println(d);
		int mut = mathInt.mut(a, b);
		System.out.println(mut);
		
	}
}
