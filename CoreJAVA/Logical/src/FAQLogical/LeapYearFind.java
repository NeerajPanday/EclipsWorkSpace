package FAQLogical;
import java.util.*;
public class LeapYearFind {

	public static void main(String[] args) 
	{
		System.out.println("pls Enter four digit value for year");
		Scanner sc=new Scanner(System.in);
        int a;
       // String c;
        a=sc.nextInt();
        //if(a.value>0 && a.length()<=4)
        
        	//System.out.println("yes this valid for year value");
        	if (a%4==0)
        	{
        	System.out.println("this is leap year");	
        		
        	}else
        	{
        		System.out.println("this is not leap year");
        	}
        }
	}


