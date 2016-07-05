package com.neeraj;

public class ThreadName3 {

	public static void main(String[] args) {
		MyThread9 m1=new MyThread9();
		
		Thread t=new Thread(m1,"NEERAJ");
		System.out.println(Thread.currentThread().getName());
		Boolean b=t.isDaemon();
		System.out.println(b);

	}

}
class MyThread9 implements Runnable{
	public void run(){
		System.out.println("Neeraj");
	}
}