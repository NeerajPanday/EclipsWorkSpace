package com.jlcindia.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 1; i <=n; i++) {
			boolean b = true;
			for (int j = 2; j < i-1; j++) {
				if (i%j== 0){
					b=false;
					break;
			}
			}
			if (b==true){
				System.out.println("value is"+i);
			}
		}
	}

}
