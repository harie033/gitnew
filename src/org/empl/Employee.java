package org.empl;

public class Employee {

	public void empID() {
		System.out.println("Employee id is 123");
	}
	public void empID(String name) {
		System.out.println("Employee name is " + name);
	}
	public void empID(int age) {
		System.out.println("Employee age is " + age);
	}
	public void empID(long phno) {
		System.out.println("Employee Ph no is " + phno);
	}
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empID();
		e.empID("hariharan");
		e.empID(28);
		e.empID(9043833551l);
	}
}

