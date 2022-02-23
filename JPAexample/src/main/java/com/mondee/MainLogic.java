package com.mondee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class MainLogic {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentdetails");
		//EntityManagerFactory emf = new Persistence().createEntityManagerFactory("studentdetails");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student s=new Student();
		s.setSid(11);
		s.setSname("bhavana");
		s.setSmarks(60);
		em.persist(s);
		em.getTransaction().commit();
		
		System.out.println(s.getSid() +" "+s.getSmarks()+" "+s.getSname());
	}

}