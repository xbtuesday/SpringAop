package com.Lpan.SaopTest.aop1.model;

public class PayModel {
	private String id;
	private String name;
	private String payType;
	private String payTime;
	private String payCount;
	private String payAmount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayCount() {
		return payCount;
	}
	public void setPayCount(String payCount) {
		this.payCount = payCount;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	@Override
	public String toString() {
		return "PayModel [id=" + id + ", name=" + name + ", payType=" + payType + ", payTime=" + payTime + ", payCount="
				+ payCount + ", payAmount=" + payAmount + "]";
	}
	
}
