package com.neeraj.scf;

//import org.omg.Messaging.SyncScopeHelper;

public class OrderStaticElement {
        static int a=10;
        static {
        	 m1();
        	 {
        		 System.out.println(a);
        		System.out.println("1st static block");
        		
        	 }
        	System.out.println(a);
        }
	public static void main(String[] args) {
	System.out.println("this is main method");
     System.out.println(a);
	}
	public static void m1() {
		System.out.println("second staic block ");
		System.out.println(a);
	}
	
}
