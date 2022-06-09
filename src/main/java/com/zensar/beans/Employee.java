package com.zensar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int employeeID;
	private String employeeName;
	
	@Autowired
	@Qualifier("departmentTwo")
	private Department department;
	
	public Employee() {
		super();
	}
	

	public Employee(Department department) {
		super();
		this.department = department;
	}




	public Employee(int employeeID, String employeeName, Department department) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.department = department;
	}


	public Employee(int employeeID, String employeeName) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	
	
	
	

}
