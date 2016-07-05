package p.k;

public class Chech {
	public static void main(String [] args){
		int k=1;
		for(int i=1;i<=25;i++){
			System.out.print(k++ +" ");
			if(i%5==0){
				System.out.println();
				k=1;	
			}
		}
		
	}
}
