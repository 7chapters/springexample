package com.excel.orm_03._02SpringHibernateApproach1;

import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/excel/orm_03/_02SpringHibernateApproach1/SpringHibernate.xml");
		
		BeanFactory factory = (BeanFactory)ctx;
		
		DemoInter d = (DemoInter)factory.getBean("d1");
		
		Iterator i1 = d.getData();
		
		while(i1.hasNext())
		{
			User u1 = (User)i1.next();
			
			System.out.println(u1.getUid()+" "+u1.getUname()+" "+u1.getRole());
		}

	}

}
