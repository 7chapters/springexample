package com.excel.core_01.applicationContextContainer._17Wiring._3AutowireConstructor;
public class TestBean {
	String msg;
	public TestBean() {
		System.out.println("zero arg. constructor of TestBean class.");
	}
	public void setMsg(String msg) {
		System.out.println("setMsg() of TestBean class");
		this.msg = msg;
	}

	@Override
	public String toString() {
		
		return msg;
	}
	
	

	

}
