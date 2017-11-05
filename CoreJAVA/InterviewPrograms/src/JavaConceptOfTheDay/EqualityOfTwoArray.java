package JavaConceptOfTheDay;

import java.util.Arrays;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		String[] s1={"Mohan","sohan","Ram","Shyam"};
		String[] s2={"Ram","Shyam","Mohan","sohan"};
		String[] s3={"Ram","Shyam","Mohan","sohan"};
		Arrays.sort(s1);
		
		Arrays.sort(s2);
		
	    System.out.println(Arrays.equals(s1, s2));
	    System.out.println(Arrays.equals(s2, s3));
	}

}
