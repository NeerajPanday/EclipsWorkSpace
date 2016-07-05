package FAQLogical;

import java.util.TreeSet;

public class Compare1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new Employee(101,"Neeraj"));
		t.add(new Employee (103,"Kumar"));
		t.add(new Employee(102,"Pandey"));
		System.out.println(t);

	}

}
class Employee implements Comparable{
	int eid;
	String name;
	Employee(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
	public int compareTo(Object obj){
		if(obj instanceof Employee){
			Employee e=(Employee)obj;
			
			return this.name.compareTo(e.name);
		}
		return 0;
	}
	public String toString(){
		return eid+" "+name;
	}
}