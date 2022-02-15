package com.mondee;
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
		CreditCard cc=new CreditCard();
		cc.setPaymentId(111);
		cc.setAmount(10000);
		cc.setCreditCardType("VISA");
		
		Cheque cq=new Cheque();
		cq.setPaymentId(112);
		cq.setAmount(20000);
		cq.setChequeType("ICICI");
		 se.save(cc);
		 se.save(cq);
		tx.commit();
		se.close();
		}
}