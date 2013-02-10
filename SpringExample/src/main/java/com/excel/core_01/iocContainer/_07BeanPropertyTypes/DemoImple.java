package com.excel.core_01.iocContainer._07BeanPropertyTypes;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoImple implements DemoInter{
	private float salary;
	private TestBean tb = null;
	private Date dt = null;
	private List fruits = null;
	private List veg = null;
	private Set phone_nos = null;
	private Set emails = null;
	private Map perDetails = null;
	private Map capitals = null;
	private Properties faculties = null;
	private String courses[];
	private int runs[];
	
	public String sayHello() {
		
		return "Hello Friends... Gmg. :) "+
		" salary = "+salary+
		" tb = "+tb.toString()+
		" dt = "+dt.toString()+
		" fruits = "+fruits.toString()+
		" veg = "+veg.toString()+
		" phones = "+phone_nos.toString()+
		" emails = "+emails.toString()+
		" perDetails = "+perDetails.toString()+
		" capitals = "+capitals.toString()+
		" faculties = "+faculties.toString()+
		" courses = {"+courses[0]+" "+courses[1]+"}"+
		" runs = {" + runs[0]+" "+runs[1]+"}";
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setVeg(List veg) {
		this.veg = veg;
	}

	public void setPhone_nos(Set phone_nos) {
		this.phone_nos = phone_nos;
	}

	public void setEmails(Set emails) {
		this.emails = emails;
	}

	public void setPerDetails(Map perDetails) {
		this.perDetails = perDetails;
	}

	public void setCapitals(Map capitals) {
		this.capitals = capitals;
	}

	public void setFaculties(Properties faculties) {
		this.faculties = faculties;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public void setRuns(int[] runs) {
		this.runs = runs;
	}
	
}