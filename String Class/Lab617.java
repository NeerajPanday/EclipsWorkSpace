import java.util.Scanner;
public class Lab617

{
	public static void main(String...as)
	{
		String st1="JLC";
		String st2="JLC";
		System.out.println(st1==st2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value");
		String st3=sc.nextLine();
		System.out.println("ReEnter string value");
		String st4=sc.nextLine();
		System.out.println(st3==st4);
	}
}