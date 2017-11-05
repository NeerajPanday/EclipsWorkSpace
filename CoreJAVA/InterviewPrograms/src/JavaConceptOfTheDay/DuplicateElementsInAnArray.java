package JavaConceptOfTheDay;

import java.util.HashSet;

public class DuplicateElementsInAnArray {

	public static void main(String[] args) {
		String arr[]={"Neeraj","Pankaj","NetaJee","Neeraj"};
		HashSet<String> h=new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		
			if(!h.add(arr[i])){
				System.out.print("Duplicate element is"+arr[i]);
			}
		}

	}

}
