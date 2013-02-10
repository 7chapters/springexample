package com.excel.core_01.iocContainer._00Demo;


public class  DemoInterImpl  implements DemoInter {
	public DemoInterImpl() {
		System.out.println("Object created");
	}

	void hi() {
		System.out.println("Hi friends Gmg :)");
	}

	public String wish(String uname) {
		return   "Hello "+uname+" Have a great day :)";
	}
}