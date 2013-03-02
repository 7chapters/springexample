package info._7chapters.spring.core.coreContainer._12InstanceFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res = new ClassPathResource("com/excel/core_01/iocContainer/_12InstanceFactory/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		DemoBean d1 = (DemoBean) factory.getBean("db");
		
		System.out.print(d1.sayHello());		
	}

}
