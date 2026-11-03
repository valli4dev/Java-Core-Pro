package com.basics;
/**
 * Explain Main method :
 * whether class containing main() method or not and whether main() method is declared 
 * according to requirement or not these things won't be checked by 
 * compiler javac DemoMain.java ,At Runtime,JVM is responsible to check these things
 * At Runtime if JVM is Unable to find required main() method then we will get runtime exception i.e "NoSuchMethodError:main
 * A class can compile successfully without a main() method.The JVM invokes main() without first creating an instance of the class.
 * 
 * Rules:
 * public — the JVM must be able to access the method.
 * static — the JVM can invoke it without creating an object of the class.
 * void — the method does not return a value to the JVM.
 * main — this is the method name recognized as the traditional application entry point inside jvm.
 * String[] args — These are command-line arguments.
 
 *Main method with sychronized modifier
 *Main method with final 
 *Main method strictfp
 *  Main method always applicable for overloaded method but JVM will always call String[] arugument main method only.
 *  The other Overloaded method we have to call explicitly then it will be executed just a normal method call.
 *  Overloading of the main method is possible but jvm will always call String[] argument main method only.
 *  The other overloaded method we have to call explicitly then it will be executed just a normal method call.
 */
public class DemoMain {
	
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
