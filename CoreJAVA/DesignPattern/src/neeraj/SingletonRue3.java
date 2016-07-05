package neeraj;

public class SingletonRue3 {

	public static void main(String[] args) {
		Hello h=Hello.getHello();
		System.out.println(h);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());

	}

}
class Hello2{
	private static Hello2 ins=null;
	private Hello2(){}
	public static Hello2 getHello3(){
		if(ins==null)
			ins=new Hello2();
		return ins;
	}
}
