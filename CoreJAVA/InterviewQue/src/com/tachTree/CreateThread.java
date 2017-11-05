package com.tachTree;

public class CreateThread {

	public static void main(String[] args) {
		MyThread mt=new MyThread ();
		
		Thread t=new Thread(mt);
		t.start();
		for (int i = 0; i <5; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
class MyThread implements Runnable{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
