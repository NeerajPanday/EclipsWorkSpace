package com.neeraj;

public class ThreadName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread7 m=new MyThread7();
		System.out.println(m.getName());
		Thread.currentThread().setName("Neeraj");
		System.out.println(Thread.currentThread().getName());

	}

}
class MyThread7 extends Thread
{
	public void run(){
		System.out.println("Hello");
	}
}