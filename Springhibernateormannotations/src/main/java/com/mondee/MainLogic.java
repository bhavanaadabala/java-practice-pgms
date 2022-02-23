package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ApplicationContext ct =new  AnnotationConfigApplicationContext(Connection.class);
			Springjdbcselect sj =ct.getBean(Springjdbcselect.class);
			
			//sj.insert();
			//sj.update();
			//sj.delete();
			sj.selectEx();

}
}