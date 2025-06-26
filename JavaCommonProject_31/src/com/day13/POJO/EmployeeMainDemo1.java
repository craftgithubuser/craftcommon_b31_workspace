package com.day13.POJO;

import java.util.*;

public class EmployeeMainDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> al = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		//set a value to the variable - write data to variable
		e1.setEmpId(101);
		e1.setEmpName("Jamie");
		e1.setEmpSalary(3000.45);
		//adding employee info to array list
		al.add(e1);
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Alisa");
		e2.setEmpSalary(13000.45);
		al.add(e2);
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.println("Employee Info;" + "ID:" + emp.getEmpId() + ",  Name:" + emp.getEmpName() + ",  Salary:" + emp.getEmpSalary());
		}
	}
}
