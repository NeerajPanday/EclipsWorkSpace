package FAQLogical;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		System.out.println("pls Enter 3 values"); 
		
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y && x>z)
		{
			System.out.println(x+"is bggest number");
		}
		else if(x<y && y>z)
		{
			System.out.println(y+"is biggest no");
		}
		else if(z>x && y<z)
		{
			System.out.println(z+"is bigesst no");
		}
		else{
			System.out.println("dont Enter same values12");
		}
	  }		
	}


