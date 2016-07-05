package FAQLogical;
import java.util.*;
public class Remainder {

	public static void main(String[] args) {
		System.out.println("Enter two values");
		int a ,b ,c;
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        b=s.nextInt();
        if(a>b){
        c=a/b;
        System.out.println(c);
        }else
        {
        	c=b/a;
        	System.out.println(c);
        }
	}

}
