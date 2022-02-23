package com.mondee;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Springjdbcselect 
{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
	}
	
	public void selectEx() 
	{
		Session se=sessionFactory.openSession();
		Query qr=se.createQuery("from Student s");
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) 
		{
			Student s=(Student)i.next();		
			System.out.println(s.getSid()+" "+s.getSmarks()+" "+s.getSname());
		}
		
		}
	
	public void insert() 
	{
		
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=new Student();
		s1.setSid(40);
		s1.setSmarks(70);
		s1.setSname("surya");
		se.save(s1);
		tx.commit();
	}

  public void update() 
  {
		
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=se.load(Student.class,40);
		s1.setSname("hari");
		se.update(s1);
		tx.commit();
	}
  
  public void delete()
  {
	  Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=se.load(Student.class,30);
		se.delete(s1);
		tx.commit();
  }
  
  
  
}
