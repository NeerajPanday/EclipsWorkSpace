package com.neeraj;

public class ThreadDemo5 {

	public static void main(String[] args) {
		MyDemo1 m=new MyDemo1();
		//MyDemo1 m2=new MyDemo1();

		Thread d=new Thread();
		Thread d1=new Thread(m);
		for(int i=0;i<=5;i++){
			System.out.println("Hai");
		}
		
		

	}

}
class MyDemo1 implements Runnable{
	public void run(){
		for(int a=0;a<=5;a++){
			System.out.println("Hello");
		}
	}
}