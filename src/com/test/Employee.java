package com.test;

public class Employee {
	private int empID;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empID, String name, String ssn, double salary) {
		this.empID = empID;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public void changeName(String name) {
		if(name != null)
			this.name = name;
	}
	
	public void raiseSalary(double increase) {
		if(increase > 0)
			this.salary += increase;
	}
	
	public String getDetails() {
		return "ID: "+this.empID+" Name: "+this.name;
	}
	
}
