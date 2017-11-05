package JavaConceptOfTheDay;

import java.util.Scanner;

public class ArmstrongNUMBER {

	public static void main(String[] args) {
		int num;
		int rem;
		int sum=0;
		int temp;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		temp=num;
		while(num>0){
			rem=num%10;
		num=num/10;
		sum=sum+(rem*rem*rem);
		}
		if(temp==sum)
			System.out.println("yes");
		else
			System.out.println("no");
		}
		
	}


