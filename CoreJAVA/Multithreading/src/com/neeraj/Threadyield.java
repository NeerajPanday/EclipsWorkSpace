package com.neeraj;

public class Threadyield {

	public static void main(String[] args) {
		Mythread10 my=new Mythread10();
		
		Thread t=new Thread(my);
		t.start();
		t.yield();
		int s=t.getPriority();
		System.out.println("priority name:-"	+s);
		for(int a=0;a<=5;a++){
			System.out.println("Hello");
		}

	}

}
class Mythread10 implements Runnable{
	public void run(){
		for(int a=0;a<=5;a++){
			System.out.println(a*5);
		}
	}
}