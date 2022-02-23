package com.mondee;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

@EnableTransactionManagement
public class Connection {
  @Bean
    public DataSource getDataSource() {
    	DriverManagerDataSource ds = new DriverManagerDataSource();
         ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
         ds.setUrl("jdbc:mysql://localhost:3306/mondee");
         ds.setUsername("root");
         ds.setPassword("Meta@123");
         return ds;
    }

    @Bean
    LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(getDataSource());

        Properties props=new Properties();
        props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

        props.put(Environment.SHOW_SQL, "true");

        
        props.put(Environment.HBM2DDL_AUTO, "update");

        factoryBean.setHibernateProperties(props);
        factoryBean.setAnnotatedClasses(Student.class);
        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
    @Bean
	public Springjdbcselect getSpringJdbcSelect()
	{
		Springjdbcselect sj=new Springjdbcselect();
		sj.setSessionFactory(getTransactionManager().getSessionFactory());
		return sj;
	}
	
}