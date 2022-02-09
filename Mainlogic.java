package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class Mainlogic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf = new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		Student bhavana = new Student();
		bhavana.setSid(1201);
		bhavana.setSname("bhavana adabala");
		bhavana.setSmarks(50);
		bhavana.setSaddress("hyd");
		se.save(bhavana);
		tx.commit();
		se.close();
		}	
	}