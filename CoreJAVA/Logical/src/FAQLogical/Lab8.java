package FAQLogical;

public class Lab8 {

	public static void main(String[] args) {
		String s="KUMAR";
		String[] s1=s.split("");
		for(int i=0;i<=s1.length-1;i++){
			System.out.print(s1[i]);
			
		}
		System.out.println("\n");
		for (int i = s1.length-1; i >=0; i--) {
			System.out.print(s1[i]);
		}

	}

}
