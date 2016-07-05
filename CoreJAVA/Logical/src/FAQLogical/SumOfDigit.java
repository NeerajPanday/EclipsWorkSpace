package FAQLogical;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		System.out.println("pls Enter two digit value");
        Scanner sc=new Scanner(System.in);
        		int a;
        		int sum =0;
        		int rem;
        		a=sc.nextInt();
        		rem=a%10;
        		int c=a/10;
        		int d=c/rem;
        		sum=10-d;
        		
        		System.out.println("sum is"+sum);
        		
	}

}
