package com.test;

import java.util.Objects;

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
	
	@Override
	public boolean equals(Object o) {
		if(o != null && o instanceof Employee) {
			Employee e = (Employee) o;
			return e.empID == empID && e.name.equals(name) && e.ssn.equals(ssn) && e.salary == salary;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 83 * hash + Objects.hashCode(name);
		hash = 83 * hash + Objects.hashCode(ssn);
		hash = 83 * hash + empID;
		hash = 83 * hash + (int) (Double.doubleToLongBits(salary) ^ (Double.doubleToLongBits(salary)>>>3));
		return hash;
	}
}
