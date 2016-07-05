package FAQLogical;
import java.util.*;
public class GradOfStudent {

	public static void main(String[] args) {
		System.out.println("Enter your marks in percent");
        Scanner sc=new Scanner(System.in);
        int hindi,eng,math,sci,soc;
        hindi=sc.nextInt();
        eng=sc.nextInt();
        math=sc.nextInt();
        sci=sc.nextInt();
        soc=sc.nextInt();
        System.out.println("ok is all reqired value");
        int sum=hindi+eng+math+sci+soc;
        System.out.println("this is sum of all sibject"+sum);
        int percentage;
        percentage=(sum*100)/500;
        System.out.println("your total percantage is"+percentage);
        if(percentage>=75)
        {
        	System.out.println("you have 'A' grade marks" );
        }else if(percentage<75 && percentage>=45)
        {
        	System.out.println("you have 'B' grade marks");
        } else if(percentage<45&& percentage>=30)
        {
        	System.out.println("you have 'C' grade marks");       	
        }else
        {
        	System.out.println("ohhhh!!! All the Best for Next examination");
        }
	}

}
