package JavaConceptOfTheDay;

import java.util.Scanner;

public class SumOfAllDigitOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter number");
		int remendor;
		int sum=0;
		int a=n;
		while(n>0){
			remendor=n%10;
			sum=sum+remendor;
			n=n/10;	
		}
		System.out.println(sum);
		
	}

}
