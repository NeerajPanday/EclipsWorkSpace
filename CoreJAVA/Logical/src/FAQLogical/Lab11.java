package FAQLogical;

public class Lab11 {

	public static void main(String[] args) {
		String s="madam";
		String d="";
		String[] s1=s.split("");
		for (int i = s1.length-1; i >=0; i--) {
			d=d+s1[i];
		}
		System.out.println(d);
		if(d.equals(s)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}

}
