package neeraj;

public class PolyCase2 {

	public void methodOne(String s){
		System.out.println("String version ");
	}
	public void methodTwo(Object o){
		System.out.println("Object version");
	}
	public static void main(String[] args) {
		PolyCase2 p=new PolyCase2();
		p.methodOne("Neeraj");
		p.methodTwo(new Object());
		p.methodOne(null);

	}

}
