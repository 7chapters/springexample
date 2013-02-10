package com;
public class GetPackageInfo {

	public static String getInfo(Class cla){
		return cla.getPackage().getName().replace(".", "/")+"/";
	}
}
