package FAQLogical;

import java.util.TreeSet;

public class Compare {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(new Student(30,"Neeraj"));
		s.add(new Student(10,"Kumar"));
		s.add(new Student(20,"Pandey"));
		System.out.println(s);

	}

}
class Student implements Comparable{
    int sid;
    String sname;
    Student(int sid,String sname){
    	this.sid=sid;
    	this.sname=sname;
    }
	
	public int compareTo(Object obj) {
		Student s1=(Student)obj;
		return this.sid-s1.sid;
	
		
		
	}
	public String toString(){
		return sid+" "+sname;
	}
}