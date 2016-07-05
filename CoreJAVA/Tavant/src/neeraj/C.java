package neeraj;
class A
{
	public static Integer i=10;
	void m1(){
		System.out.println("Hello");
	}
}
class B extends A
{
	public static Integer i=20;
	void m1()
	{
		System.out.println("Hia");
	}
}

public class C {

	public static void main(String[] args) {
		
A  a=new A();
System.out.println(A.i);
B b=new B();
System.out.println(A.i);
A a1=new B();
System.out.println(A.i);
a1.m1();
//B b1=new A();
//System.out.println(b1.i);
	}

}
