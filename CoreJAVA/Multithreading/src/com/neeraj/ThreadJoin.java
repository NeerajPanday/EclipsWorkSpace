package com.neeraj;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		MyThread11 m=new MyThread11();
         m.start();
        m.join();
         for(int a=0;a<=5;a++){
        	 System.out.println("Hai");
         }
	}
	 
}
class MyThread11 extends Thread{
	
	public void run(){
		for(int b=0;b<=5;b++){
			System.out.println("Hello");
		}
		try{
			Thread.sleep(200);
		}catch(Exception e){
			
		}
		
	}
}