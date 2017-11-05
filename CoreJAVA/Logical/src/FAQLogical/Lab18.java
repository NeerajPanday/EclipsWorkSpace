package FAQLogical;

public class Lab18 {

	public static void main(String[] args) {
		String s="Neeraj";
		String[] ar=s.split("");
		int count=1;
		boolean bool=true;
		for (int i = 0; i < ar.length; i++) {
			if(bool){
				for (int j = i-1; j >=0; j--) {
					if(ar[i]==ar[j]){
						bool=false;
						break;
					}
				}
			}
			if(bool){
				for (int j = i+1; j < ar.length; j++) {
					if(ar[i]==ar[j]){
						count++;
					}
				}
				System.out.println(ar[i]+" "+count);
				count=1;
				
			}
			bool=true;
		}
	}

}
