package com.mondee;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Connection {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dm= new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/mondee");
		dm.setUsername("root");
		dm.setPassword("Meta@123");
		
		return dm;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		
		return jd;
	}
	
	@Bean
	public Springjdbcselect getSpringjdbcselect()
	{
		Springjdbcselect sjd=new Springjdbcselect();
		sjd.setJt(getJdbcTemplate());
		
		return sjd;
	}
}
