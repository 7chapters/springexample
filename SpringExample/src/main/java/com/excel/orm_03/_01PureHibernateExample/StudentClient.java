package com.excel.orm_03._01PureHibernateExample;
// insertion of a record into student table


import org.hibernate.cfg.*;
import org.hibernate.*;

class StudentClient 
{
	public static void main(String[] args) 
	{
		//activate hibernate software

		Configuration cfg = new Configuration();


		//read configuration file

		cfg  = cfg.configure();

//		cfg  = cfg.configure("sathya.xml");



		// create SessionFactory 

		SessionFactory factory = cfg.buildSessionFactory();

		//getting session from session factory

		Session ses = factory.openSession();

		//creation of StudentBean class object

		StudentBean st1 = new StudentBean();

		st1.setSid(564);
		st1.setSname("Mani Vannan :)");
		st1.setTot_m(100.0f);



		//creation of Transaction object as we are modifying database table

		Transaction tx = ses.beginTransaction();

		ses.save(st1);

		tx.commit();

		System.out.println("Record Inserted!");

		ses.close();

		factory.close();

	}
}
