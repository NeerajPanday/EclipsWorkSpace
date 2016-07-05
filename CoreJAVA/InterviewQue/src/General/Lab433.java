package General;

public class Lab433 {

	public static void main(String[] args) {
		new Hello1();

	}

}
class Hai1{
	int a=99;
	{
		System.out.println("Hai block");
	}
}
class Hello1 extends Hai1{
	int b=88;
	{
		System.out.println("Hello1"+a);
		System.out.println("Hello1"+b);
	}
}