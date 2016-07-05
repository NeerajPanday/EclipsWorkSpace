package com.neeraj;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Mythread2 t=new Mythread2();
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println("main thread");
		}
	
	}

}
class Mythread2 extends Thread
{
	public void run(){
		for(int i=0;i<=10;i++){
		System.out.println("chlild thread");
		}
		}
	public void run(int i){
		System.out.println("Hello");
	}
}