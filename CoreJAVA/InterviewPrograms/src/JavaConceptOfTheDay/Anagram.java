
package JavaConceptOfTheDay;

import java.util.Arrays;

/*
 * @author Neeraj
 *
 */
public class Anagram {
	static void isAnagram(String s1, String s2){
		String s3=s1.replaceAll("\\s","");
		String s4=s2.replaceAll("\\s","");
		boolean status=true;
		if(s3.length()!=s4.length()){
			status=false;
		}else{
			char[] ch1=s3.toLowerCase().toCharArray();
			char[] ch2=s4.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status=Arrays.equals(ch1,ch2);
			System.out.println(status);	
		}
			if(status){
				System.out.println(s1 +" and "+s2+" is Anagram ");
			}else{
				System.out.println("not Anagram");
			}
	}
	public static void main(String[] args) {
		isAnagram("keep","peek");
		

	}

}
