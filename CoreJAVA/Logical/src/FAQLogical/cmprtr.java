package FAQLogical;

import java.util.Comparator;
import java.util.TreeSet;

public class cmprtr {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new SortByName());
		t.add(new Employee1(1,"Neeraj","Bangalore"));
		t.add(new Employee1 (2,"Kumar","Pune"));
		t.add(new Employee1(3,"Pandey","Chennai") );
		System.out.println(t);

	}

}
class Employee1 {
	int id;
	String name;
	String add;
	Employee1(int id,String name,String add){
		this.id=id;
		this.name=name;
		this.add=add;
	}
	public String toString(){
		return id+" "+name+" "+add;
	}
}
class IdSort implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Employee1 i=(Employee1)o1;
		Employee1 i1=(Employee1)o2;
		return  i.id-i1.id;
	}
}