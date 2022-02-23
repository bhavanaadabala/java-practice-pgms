package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbcLogic {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootJdbcLogic.class, args);
		
EmployeDao ed=ca.getBean(EmployeDao.class, args);
 Employe ee=new Employe();
 ee.setEid(2205);
ee.setEname("bhavana");
ee.setEsalary(22000);
ed.insert(ee);
	}	
}