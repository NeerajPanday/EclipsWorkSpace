package neeraj;

public class Lab22 {

	public static void main(String[] args) {
		Bb b=new Bb();
		b.m2();
		
	}

}
class Aa{
	public void m1(){
		System.out.println("a");
	}
}
class Bb extends Aa{
	public void m2(){
		System.out.println("B");
	}
}