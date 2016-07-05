package General;

public class Lab432 {

	public static void main(String[] args) {
		System.out.println(Hello.a);

	}

}
class Hai{
	static int a=10;
static	{
		System.out.println("Hai->sb");
	}
}
class Hello extends Hai{
	static{
		System.out.println("Hello->sb");
		
	}
}