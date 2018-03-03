package com.kevind.Spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kevindornella.springDomai.HumanResourceDept;
import com.kevindornella.springDomai.organization;

public class DIConstructor {

	public static void main(String[] args) {
		//create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//create the bean
		organization org = (organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
//		System.out.println(org);
	
//		System.out.println(org.corporateService());
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
				System.out.println(hrdept.hiringStatus(5550));
		
		//close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
