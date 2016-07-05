package com.mahindra;

import org.omg.Messaging.SyncScopeHelper;

public class Constructor {

	public static void main(String[] args) {
		

	}

}
class Aa{
	Aa(int a, int b){
		System.out.println("Heelo");
	}
}
class B1 extends Aa
{

	B1(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}