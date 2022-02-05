package com.test;

public class Manager extends Employee{
	private String deptName;

	public Manager(int empID, String name, String ssn, double salary, String deptName) {
		super(empID, name, ssn, salary);
		this.deptName = deptName;
	}
	
	public Manager(int empID, String name, String ssn, double salary) {
		super(empID, name, ssn, salary);
		this.deptName = "";
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " Department: "+deptName;
	}
}
