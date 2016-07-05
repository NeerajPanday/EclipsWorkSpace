package com.neeraj;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Mythread4 t1=new Mythread4();
		t1.start();
		
		System.out.println("Hello World");
		
	}

}
class Mythread4 extends Thread{
	public void start(){
		System.out.println("cant override start()");
		//because this is called as normal method calls
	}
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("Hello");
		}
	}
}