package neeraj;
public class TestA {
    int a;
}
class TestB{
	int a=10;
	void methodA(TestA ahf){
		int a=10;
		System.err.println(ahf.a);
		 a=300;
		System.out.println(ahf.a);
			
	}
	public static void main(String[] args) {
		TestA a=new TestA();
		TestB b=new TestB();
		b.methodA(a);
		System.out.println(a);
	}
}