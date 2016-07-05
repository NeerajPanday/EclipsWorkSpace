package neeraj;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());
		System.out.println(Object.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		System.out.println(Test1.class.getClassLoader());
	}

}
