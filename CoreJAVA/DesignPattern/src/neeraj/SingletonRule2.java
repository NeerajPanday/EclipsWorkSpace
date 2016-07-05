package neeraj;

public class SingletonRule2 {

	public static void main(String[] args) {
		Hello h=Hello.getHello();
		System.out.println(h);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());

	}

}
class Hello1
{
	private static Hello1 ins=null;
	static {
		ins=new Hello1();
	}
	private  Hello1(){}
	public static Hello1 getHello1(){
		return ins;
	}
}