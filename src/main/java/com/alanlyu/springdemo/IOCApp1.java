package com.alanlyu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the application context(container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		//create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke the company slogan via the bean
		org.corporateSlogan();
		
		//close the application context
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
