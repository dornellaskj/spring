package com.kevind.Spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		//create application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		//create the bean
		organization org = (organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		org.corporateSlogan();
		
		//close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
