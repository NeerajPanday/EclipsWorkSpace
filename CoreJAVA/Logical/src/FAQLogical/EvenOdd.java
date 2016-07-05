package FAQLogical;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("please Enter Your choice Value");
		int a;
		Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a%2==0)
        	
        {
        	System.out.println("this is  the even no");
        }else
        {
        	System.out.println("this in odd value");
        }
        
	}
}
