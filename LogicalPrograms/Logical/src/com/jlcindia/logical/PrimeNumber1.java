package com.jlcindia.logical;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		boolean flag=true;
		for ( i = 2; i <=n; i++) {
			if(n%i==0){
				flag=false;
				break;
				
			}
		}
          if(n==i){
        	  System.out.println(n+"is prime");
          }else{
        	  System.out.println(n+"is not prime");
          }
	}
}
