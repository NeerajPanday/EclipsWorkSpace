package FAQLogical;

public class Lab13 {

	public static void main(String[] args) {

		String s = "neeraj";
		String dupcheck = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (!dupcheck.contains("" + s.charAt(i))) {
				dupcheck=""+s.charAt(i);
				int count = 0;
				for (int j = i; j < ch.length; j++) {
					if (s.charAt(i) == ch[j]) {
						count++;
					}

				}
				System.out.println(s.charAt(i) + " " + count);
			}
		}

		//
		// for (int i = 0; i <= ch.length-1; i++) {
		// System.out.print(ch[i]);
		// }
	}
	// System.out.println(count);
}
