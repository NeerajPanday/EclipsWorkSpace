package neeraj;

public class Neeraj {

	public static void main(String[] args) {
	 A1 a=new A1();
	 a.m2();
	 a.m1(10);
	}

}
class A1{
	public void m1(int x){
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println("Hello");
	}
}