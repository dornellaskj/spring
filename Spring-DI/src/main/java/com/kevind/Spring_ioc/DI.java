package com.kevind.Spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kevindornella.springDomai.organization;

public class DI {

	public static void main(String[] args) {
		//create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//create the bean
		organization org = (organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
		System.out.println(org);
		
		System.out.println(org.corporateService());
		
		//close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
