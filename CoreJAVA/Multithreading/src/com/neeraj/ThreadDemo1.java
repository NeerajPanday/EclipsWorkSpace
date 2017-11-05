package com.neeraj;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Mythread t=new Mythread();
		t.start();
		
		for(int i=0;i<=10;i++){
			System.out.println("main thread");
		}
		//t.start();
	}

}
class Mythread extends Thread
{
	public void run(){
		for(int i=0;i<=10;i++){
		System.out.println("chlild thread");
		}
	}
}