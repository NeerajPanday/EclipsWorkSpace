package neeraj;

public class VeriFone {

	public static void main(String[] args) {
		Hello h=new Hai();
		Hai h1=(Hai)h;
		h1.m3();
		
	}

}
class Hello {
	public void m1(){
		System.out.println("m1 is called");
	}
	
}
class Ha extends Hello{
	public void m2(){
		System.out.println("m2 is called");
	}
	
		public void m1(){
			System.out.println("m1 r is called");
		}
}
class Hai extends Ha{
	public void m1(){
		System.out.println("m2111 is second");
	}
	public void m3(){
		System.out.println("m2111 is second");
	}
}