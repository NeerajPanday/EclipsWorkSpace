package com.neeraj;

public class Threaddemo6 {

	public static void main(String[] args) {
		MyThread6 r=new MyThread6();
		Thread d=new Thread(r);
		d.start();
		for(int b=1;b<=5;b++){
			System.out.println("Hai");
		}
		

	}

}
class MyThread6 implements Runnable{
	public void run(){
		for (int a=0; a<=5;a++){
			System.out.println("Hello");
		}
	}
}