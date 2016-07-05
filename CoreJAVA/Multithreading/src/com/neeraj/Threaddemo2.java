package com.neeraj;

public class Threaddemo2 {

	public static void main(String[] args) {
		Mythread1 t=new Mythread1();
		t.run();
		for(int i=0;i<=10;i++){
			System.out.println("main thread");
		}
	
	}

}
class Mythread1 extends Thread
{
	public void run(){
		for(int i=0;i<=10;i++){
		System.out.println("chlild thread");
		}
	}
}