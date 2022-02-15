package com.mondee;
import java.util.ArrayList;
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
		
		Customers c1=new Customers();
		c1.setCustomerId(01);
		c1.setCustomerName("bhavana");
		
		Customers c2=new Customers();
		c2.setCustomerId(02);
		c2.setCustomerName("sunayana");
		
		Set customers=new HashSet();
		customers.add(c1);
		customers.add(c2);
		
		Orders o1=new Orders();
		o1.setOrderId(001);
		o1.setOrderName("chilly chicken");

		Orders o2=new Orders();
		o2.setOrderId(002);
		o2.setOrderName("chicken 65");
		
		Set orders=new HashSet();
		orders.add(o1);
		orders.add(o2);
		
		
		
		c2.setOrders(orders);
		c1.setOrders(orders);
		o1.setCustomers(customers);
		o2.setCustomers(customers);
		
		se.save(c1);
		se.save(c2);
		se.save(o1);
		se.save(o2);
		
		
	tx.commit();
	se.close();
		
		
		
		
}
}