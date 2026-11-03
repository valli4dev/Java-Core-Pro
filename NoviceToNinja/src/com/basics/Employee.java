package com.basics;

public class Employee {
	int empId;
	String empName;
	double empSalary; 
public static void main(String args[]) {
	/**
	 * How many objects are created, and which references point to the same object?
	 * 2 objects are created, and e1 and e3 point to the same object.
	 */
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = e1;
	System.out.println(e3);
	
}
}
