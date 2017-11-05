package JavaConceptOfTheDay;

public class StringREverse2 {

	public static void main(String[] args) {
		String s="Neeraj";
		char[] ch=s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
		}
		

	}

}
