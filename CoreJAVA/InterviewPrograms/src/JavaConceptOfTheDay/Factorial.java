package JavaConceptOfTheDay;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial=1;
		int n;
		System.out.println("please Enter the no");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for (int i = 1; i <=n; i++) {
			factorial=factorial*i;
		}
         System.out.println(factorial);
	}

}
