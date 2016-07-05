package FAQLogical;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		System.out.print("pls Enter the required value");
		int a;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       if(a>=0)
       {
    	   System.out.println("this is positive value0");
       }else 
       {
    	   System.out.println("this is negative");
       }
	}

}
