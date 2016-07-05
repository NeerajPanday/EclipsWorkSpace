package General;

public class RevString {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String[] s1=s.split(" ");
		String rev=" ";
		for (int i = 0; i < s1.length; i++) {
			//System.out.print(s.charAt(i));
			for (int j = s1[i].length()-1; j >=0; j--) {
				rev=rev+s1[i].charAt(j);
				System.out.println(" ");
			}
			
			
		}
		System.out.println(rev);
		
	}

}
