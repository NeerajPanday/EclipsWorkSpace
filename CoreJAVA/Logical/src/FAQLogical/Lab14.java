package FAQLogical;

public class Lab14 {

	public static void main(String[] args) {
		int count =1; int k=0;
		boolean b=true;
		int[] a={1,2,3,4,1,2,3,5,9,7};
		for (int i = 0; i < a.length; i++) {
			if(b){
				for (int j = i-1; j >=0; j--) {
					if(a[i]==a[j]){
						b=false;
						break;
					}
				}
			}
			if(b){
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]){
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
				count=1;
			}
			b=true;
		}	
	}
}
