package com.neeraj.GC;

public class Lab {

	public static void main(String[] args) {
		Lab l=new Lab();
		//l.finalize();
		l=null;
		System.gc();
		System.out.println("End of main");
	}
    public void finalize(){
    	System.out.println("finalize method called");
    	System.out.println(10/0);
    }
}
