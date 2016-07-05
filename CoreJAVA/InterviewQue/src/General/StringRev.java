package General;

public class StringRev {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String[] rev=s.split(" ");
		for (int i = rev.length-1; i >=0; i--) {
			System.out.print(rev[i]);
			System.out.print(" ");
		}
		

	}

}
