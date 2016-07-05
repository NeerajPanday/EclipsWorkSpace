package neeraj;

public class Test5 {

	public static void main(String[] args) {
     int arr[]={2,3,5,4,7,4,5};
     int sum=0;
     for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
	}
     for (int i = 0; i < arr.length; i++) {
		int sum1=sum-arr[i];
		System.out.println(sum1);
	}
	}

}
