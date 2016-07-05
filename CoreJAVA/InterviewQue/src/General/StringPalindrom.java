package General;

public class StringPalindrom {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		String[] s1=s.split("");
		for (int i = s1.length-1; i >=0; i--) {
			rev=rev+s1[i];
		}
       System.out.print(rev);
       if(rev.equals(s)){
    	   System.out.println("yes");
       }else{
    	   System.out.println("no");
       }
    	   
       }
	}


