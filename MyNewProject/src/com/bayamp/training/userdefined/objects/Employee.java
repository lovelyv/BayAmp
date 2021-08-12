package com.bayamp.training.userdefined.objects;

public class Employee {
	String firstName;
	String LastName;
	String department;
	String designation;
	String empId;
	long salary;
	boolean isNightShift;
	String address;
	
	
	public Employee(String firstName, String lastName, String department, String empId) {
		
		this.firstName = firstName;
		LastName = lastName;
		this.department = department;
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public boolean isNightShift() {
		return isNightShift;
	}
	public void setNightShift(boolean isNightShift) {
		this.isNightShift = isNightShift;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmpId() {
		return empId;
	}

}
