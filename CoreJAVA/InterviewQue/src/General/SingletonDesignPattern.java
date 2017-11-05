package General;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		
		Helloq h=Helloq.getHello();
		System.out.println(h);
		
		System.out.println(Helloq.getHello());
		Helloq h2=(Helloq)h.clone();
		System.out.println(h2);
		

	}

}
class Helloq{
	private static Helloq h=new Helloq();
	private Helloq(){};
	public static Helloq getHello(){
		return h;
	}
	protected Object clone(){
		return this;
	}
}