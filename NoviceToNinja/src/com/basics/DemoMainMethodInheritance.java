package com.basics;
/**
 * NOTE:For main method inheritance and overloading concepts are applicable but overriding concept is not applicable instead of overriding method hiding concept is applicable
 * Method hiding occurs when a subclass defines a static method with the same signature as a static method in its superclass.
 */

public class DemoMainMethodInheritance {
public static void main(String args[]) {
	System.out.println("Parents Main");
}
class C extends DemoMainMethodInheritance{
	public static void main(String args[]) {
		System.out.println("child Main");
	}
}
}
