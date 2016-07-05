package General;

import java.util.TreeSet;

public class Comprble {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new Student(99,"Neeraj"));
		t.add(new Student(77,"Pandey"));
		t.add(new Student(55,"Kuamr"));
		t.add(new Student(66,"Achu"));
		System.out.println(t);

	}

}
class Student implements Comparable  {
	int sid;
	String sname;
	Student(int sid,String  sname){
		this.sid=sid;
		this.sname=sname;
		
	}
	public int compareTo(Object to){
		Student s1=(Student)to;
		return -(this.sname.compareTo(s1.sname));
	}
	public String toString(){
		return sid+" "+sname;
	}
}