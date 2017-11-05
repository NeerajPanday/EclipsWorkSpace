package JavaConceptOfTheDay;
public class MissingNoInArray {

	static int sumOfNumbers(int n){
		int sum=( n*(n+1)/2);
		return sum;
	}
	static int sumOfElement(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n=8;
		int[] a={1,2,3,5,7,8,6};
		int sumofno=sumOfNumbers(n);
		System.out.println(sumofno);
		int sumofelement =sumOfElement(a);
		System.out.println(sumofelement);
		int missingNo=sumofno-sumofelement;
		System.out.println(missingNo);
	}
}
