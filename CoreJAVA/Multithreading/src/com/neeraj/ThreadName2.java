package com.neeraj;

public class ThreadName2 {

	public static void main(String[] args) {
	Mythread8 t=new Mythread8("Pankaj");
	System.out.println(Thread.currentThread().getName());
	System.out.println(t.getName());
    
	}

}
class Mythread8 extends Thread{
	Mythread8(String name){
		super(name);
	}
		
	
}