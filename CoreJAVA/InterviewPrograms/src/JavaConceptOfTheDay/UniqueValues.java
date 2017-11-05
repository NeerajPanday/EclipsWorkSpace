package JavaConceptOfTheDay;

import java.util.Arrays;

public class UniqueValues {

	public static void main(String[] args) {
		int[] a={5,2,7,2,4,7,8,2,3};
		for (int i = 0; i < a.length; i++) {
			boolean b=false;
			for (int j = 0; j < i; j++) {
				if(a[i]==a[j]){
					
					b=true;
					break;
				}
			}
			if(!b){
			
				Arrays.sort(a);
				System.out.println(a[i]+"is unique ");
			}
		
		}
		
	}

}
