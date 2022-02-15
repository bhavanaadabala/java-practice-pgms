package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Student x=(Student)context.getBean("mohi");
		
		System.out.println(x.getSid()+" "+x.getSmarks()+" "+x.getSname());
	}

}
