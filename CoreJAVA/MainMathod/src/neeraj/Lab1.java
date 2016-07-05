package neeraj;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("HELLO");
	}
}
class A extends Lab1{
	//System.out.println("HAI");
	public static void main(String... args)
	{
		System.out.println("HAI");
		int[] a=new int[9];
				a[1]=1;
				a[8]=89;
				int[][] x=new int[2][];
				x[0]=new int[3];
				x[1]=new int[2];
				System.out.println(x[0]);
				System.out.println(x[1]); 
				
				//a[2]="mau"; cant store string in int
				System.out.println(a);
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[8]);
				int b=a.length;
				{
					System.out.println(b);
				}	
	}
}
