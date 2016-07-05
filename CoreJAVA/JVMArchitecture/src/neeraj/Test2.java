package neeraj;

public class Test2 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Class c1=s1.getClass();
		Class c2=s2.getClass();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		int a=c1.hashCode();
		int b=c2.hashCode();
		System.out.println(a+ "  "+b);
	}

}
