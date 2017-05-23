package com.Lpan.SaopTest.aop1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Lpan.SaopTest.aop1.model.PayModel;
import com.Lpan.SaopTest.aop1.service.PayServiceImpl;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/aopinterceptor.xml");
		PayServiceImpl bean = (PayServiceImpl) ac.getBean("payServiceImpl");
		PayModel paymodel = new PayModel();
		paymodel.setId("1");
		paymodel.setName("�̾Ʋ�");
		paymodel.setPayAmount("14");
		paymodel.setPayCount("0.7");
		paymodel.setPayType("1");
		paymodel.setPayTime("2017-05-16");
		bean.insert(paymodel);
		bean.update(paymodel);
	}
}
