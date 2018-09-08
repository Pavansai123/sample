package com.dxc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;




public class DAOEmployee {
JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addEmployee(Employee e)
	{
		String insert="insert into Employee values('"+e.getName()+"','"+e.getEmpid()+"')";
    	this.jdbcTemplate.update(insert);	
	}
	
	public List<Employee> getbyID(String id)
	{
	  String read="select * from Employee where empID='"+id+"'";
     	List<Employee> employees =this.jdbcTemplate.query(read,new Empmapper());
     	return employees;
	}
	
	public void deleteid(String id) {
		String read="Delete from Employee where empID='"+id+"'";
		this.jdbcTemplate.execute(read);
	}
	
}
