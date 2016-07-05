class Person
{
	int age;
	String name;
	int height;
	int weight;
	
	
	
	
}
class Student extends Person
{
	int rollno;
	int marks;
	public Student(int age,String name,int hieght,int weight)
	{
		this.age=age;
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.rollno=rollno;
		this.marks=marks;
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Student stu=new Student(20,"Pawan",20,20);

	}

}
