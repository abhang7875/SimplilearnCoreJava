package com.test;

public class Application {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Jim Smith", "11-11-1111", 100_000.00);
		Manager m = new Manager(101, "John Kern", "12-12-2001", 200_000.00,"Marketing");
		
		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
		
		Employee e1 = new Manager(101, "John Kern", "12-12-2001", 200_000.00,"Marketing");
		Employee e2 = new Manager(101, "John Kern", "12-12-2001", 200_000.00,"Marketing");
		System.out.println(e1.hashCode()+"\t"+e2.hashCode());
		System.out.println(e1.equals(e2));
	}
}
