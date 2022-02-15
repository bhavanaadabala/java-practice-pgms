package com.mondee;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
public class Mainlogic {
public static void main(String[] args) {
		// TODO Auto-generated method stub
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Person pe=new Person();
		pe.setPersonId(110);
		pe.setPersonName("Bhavana");
		
		Aadharcard ac=new Aadharcard();
		ac.setAadharcardNo(12345676);
		ac.setAadharName("Bhavana Adabala");
		pe.setAadharcard(ac);
		ac.setPerson(pe);
		
		se.save(pe);
		se.save(ac);
		
		
		tx.commit();
		se.close();
		}
}