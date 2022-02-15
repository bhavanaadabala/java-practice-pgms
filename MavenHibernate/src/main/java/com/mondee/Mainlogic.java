package com.mondee;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.query.NativeQuery;
public class Mainlogic {
public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Session se = Hibernate.getSessionFactory().openSession();
		Transaction tx = se.beginTransaction();
		Student2 s=new Student2();
		s.setSid(111);
		s.setSmarks(60);
		s.setSname("sree");
		
		
		
		
		NativeQuery nq=se.createSQLQuery("select * from student");
		List li=nq.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Object x[]=(Object[])i.next();
			System.out.println(x[0]+" "+x[1]+" "+x[2]);
		}
		se.save(s);
		tx.commit();
		se.close();
		}
}