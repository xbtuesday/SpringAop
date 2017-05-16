package com.Lpan.SaopTest.aop1.service;


import org.springframework.stereotype.Service;

import com.Lpan.SaopTest.aop1.model.PayModel;

@Service("payServiceImpl")
public class PayServiceImpl{

	public int insert(PayModel model) {
		int result = 0;
		System.out.println("==========插入记录=======");
		return result;
	}
	public int update(PayModel model){
		System.out.println("==========更新=========");
		return 0;
	}

}
