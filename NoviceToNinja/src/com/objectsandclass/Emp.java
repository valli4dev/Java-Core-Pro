package com.objectsandclass;
/**
 * A requirement says salary should not be directly modified, but it should be readable. How would you implement it?
 */
public class Emp {
	 String company;
	public static void main(String[] args) {
	   

	    Emp e1 = new Emp();
	    e1.company="IBM";
	    //System.out.println( e1.company);
	    Emp e2 = e1; 
//             
	        e2.company = "dxc"; 
//
        System.out.println( e1.company);
//	        System.out.println(e1.company); 
	    }
	}


