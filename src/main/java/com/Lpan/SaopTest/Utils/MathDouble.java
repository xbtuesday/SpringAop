package com.Lpan.SaopTest.Utils;

import java.math.BigDecimal;

public class MathDouble {
	
	/**
	 * �ӷ�����
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Double adds(double d1,double d2){
		BigDecimal b1 = new BigDecimal(Double.toString(d1));
		BigDecimal b2 = new BigDecimal(Double.toString(d2));
		double doubleValue = b1.add(b2).doubleValue();
		return doubleValue;
	}
	
	/**[d
	 * ��������
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Double subtract(double d1,double d2){
		BigDecimal b1 = new BigDecimal(Double.toString(d1));
		BigDecimal b2 = new BigDecimal(Double.toString(d2));
		BigDecimal subtract = b1.subtract(b2);
		return subtract.doubleValue();
	}
	
	/**
	 * �˷�
	 * @param d1
	 * @param d2
	 * @return
	 */
	public Double multiply(double d1,Double d2){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		double doubleValue = b1.multiply(b2).doubleValue();
		return doubleValue;
	}
	
	/**
	 * ����
	 * @param d1
	 * @param d2
	 * @param length
	 * @return
	 */
	public Double div(Double d1,Double d2,int length){
		BigDecimal  b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		 double doubleValue = b1.divide(b2,length,BigDecimal.ROUND_HALF_UP).doubleValue();
		return doubleValue;
	}
	
	/**
	 * ��������
	 * @param d1
	 * @param len
	 * @return
	 */
	public Double  round(double d1,int len){
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(1);
		//BigDeclmal.ROUND_HALF_UP  ��bigdecimal��һ������ ��ʾ��������
		BigDecimal bigDecimal = b1.divide(b2,len, BigDecimal.ROUND_HALF_UP);
		return bigDecimal.doubleValue();
	}
}
