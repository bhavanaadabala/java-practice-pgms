package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLogic {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ca=SpringApplication.run(SpringLogic.class, args);
		
		Student s=ca.getBean(Student.class);
		s.setSid(1023);
		s.setSname("bhavana");
		s.setSmarks(967);
		 
		System.out.println(s.getSid()+"  "+s.getSname()+" "+s.getSmarks());
	}

}