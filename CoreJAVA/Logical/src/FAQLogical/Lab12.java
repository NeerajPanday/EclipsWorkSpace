package FAQLogical;

public class Lab12 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String[] s1=s.split(" ");
		String rev="";
		for (int i = 0; i <= s1.length-1; i++) {
			for (int j =s1[i].length()-1; j >=0; j--) {
				rev=rev+s1[i].charAt(j);
			}
		}
      System.out.println(rev);
	}

}
