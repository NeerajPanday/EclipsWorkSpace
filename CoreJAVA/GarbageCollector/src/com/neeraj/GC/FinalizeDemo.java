package com.neeraj.GC;

public class FinalizeDemo {
	static FinalizeDemo d;
	public static void main(String[] args) throws InterruptedException {
		
		FinalizeDemo f=new FinalizeDemo ();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("end of  main");
		System.out.println(d.hashCode());
       
	}
   public void finalize(){
	   System.out.println("finalize method called");
	   d=this;
   }
}
