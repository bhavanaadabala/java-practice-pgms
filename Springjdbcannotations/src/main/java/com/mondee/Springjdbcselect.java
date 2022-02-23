package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Springjdbcselect {
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	/*public void insert(){
		jt.execute("insert into student values(30,80,'sri')");
		
	}*/
	/*public void update() {
		jt.execute("update student set sname='shiva' where sid=1" );
	}*/
	public void delete() {
		jt.execute("delete from student where sid=3" );
	}
	public void selectEx()
	{
		List li=jt.queryForList("select * from student");
		Iterator i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
