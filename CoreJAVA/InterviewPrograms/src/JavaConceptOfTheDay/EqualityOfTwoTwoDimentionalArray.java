package JavaConceptOfTheDay;

import java.util.Arrays;

public class EqualityOfTwoTwoDimentionalArray {

	public static void main(String[] args) {
		String[][] s1={{"Ram","Shyam","Pankaj","Neeraj"},{"Ram","Shyam","Pankaj","Neeraj"}};
		String[][] s2={{"Ram","Shyam","Pankaj","Neeraj"},{"Neeraj","Shyam","Pankaj","Ram"}};
		//Arrays.sort(s1);
		//Arrays.sort(s2);
		//can't use sort method for deepequals method.
		System.out.println(Arrays.deepEquals(s1, s2));

	}

}
