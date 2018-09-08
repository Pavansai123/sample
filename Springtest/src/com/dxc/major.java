package com.dxc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class major {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("Bean.xml");
		
		DAOEmployee empDAO=(DAOEmployee)context.getBean("edao");
		for(;;)
		{
		System.out.println("Enter choice : 1 Add Employee 2.Search 3.Delete");		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter name ");
			String name=sc.nextLine();
			System.out.println("Enter id ");
			String empid=sc.nextLine();
			sc.nextLine();
			Employee e=new Employee(name,empid);
			empDAO.addEmployee(e);
			break;
		case 2:
		System.out.println("Enter Employee ID");
		String eid = sc.nextLine();
		List<Employee> emps=empDAO.getbyID(eid);
		for(Employee em:emps)
		{
			System.out.println("ID : "+em.getName()+" NAME : "+em.getEmpid());
		}
			
		case 3:
			System.out.println("Enter Employee ID");
			String deleleID = sc.nextLine();
			empDAO.deleteid(deleleID);
			System.out.println("Delete Successful");
		}

	
		}
	}
}
