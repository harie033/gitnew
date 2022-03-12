package org.emp;

public class Employee {

	public void empId() {
		System.out.println("Employee Id is 12345");
	}
	private void empName() {
		System.out.println("Employee Name is Hariharan");
	}
	private void empDob() {
		System.out.println("Employee DOB is 20-12-93");
	}
	private void empPhone() {
		System.out.println("Employee Phone is 9043833551");
	}
	private void empEmail() {
		System.out.println("Employee Email is Harie033@gmail.com");

	}
	private void empAdress() {
		System.out.println("Employee Address is Chennai");
	}
	public static void main(String[] args) {
		
	
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAdress();


}
}