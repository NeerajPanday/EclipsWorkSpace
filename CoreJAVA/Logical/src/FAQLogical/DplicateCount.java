package FAQLogical;

public class DplicateCount {

	public static void main(String[] args) {
		String s="NNNEEREHHER";
		char[] s1=s.toCharArray();
		int count=1;
		boolean bool=true;
		for (int i = 0; i < s1.length; i++) {
			if(bool){
				for (int j = i-1; j >=0; j--) {
					if(s1[i]==s1[j]){
						bool=false;
						break;
					}
				}
			}
			if(bool){
				for (int j = i+1; j < s1.length; j++) {
					if(s1[i]==s1[j]){
						count++;
					}
				}
				System.out.println(s1[i]+" "+count);
				count=1;
				
			}
			bool=true;
		}
	}

}

