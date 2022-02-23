package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("spring.xml");
		Springjdbcselect sj=ct.getBean(Springjdbcselect.class);
		//sj.insert();
		//sj.update();
		sj.delete();
		sj.selectEx();
		
	}

}
