package com.basics;

public class DemoMainMethodOverloading {
	/**
	 * Overloading of the main method is possible but JVM  will always call String[] argument main method only.
	 * The other overloaded method we have to call explicitly then it will be executed just a normal method call.
	 */
	public static void main(String args[]) {
		System.out.println("overload1 string");
	}
	public static void main(Integer args[]) {
		System.out.println("overload2 double");
	}
	public static void main(double args[]) {
		System.out.println("overload2 double");
	}
}

