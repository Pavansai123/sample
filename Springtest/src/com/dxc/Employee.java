package com.dxc;

public class Employee {
	
	private String name;
	private String empid;
	
	
	
	public Employee(String name,String empid) {
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
		this.empid=empid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
}
