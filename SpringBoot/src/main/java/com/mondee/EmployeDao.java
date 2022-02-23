package com.mondee;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
public class EmployeDao extends JdbcDaoSupport {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
    private void initialize()
{
		setDataSource(dataSource);
}
	
	public void insert(Employe emp) {
		String sql="insert into employe value("+emp.getEid()+",' "+emp.getEname()+"',"+emp.getEsalary()+")";
		getJdbcTemplate().execute(sql);
	}
}
