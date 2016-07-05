package FAQLogical;

import java.util.Comparator;
import java.util.TreeSet;

public class Compratr {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(new Person(999,"Neeraj"));
		t1.add(new Person(888,"Kumar"));
		t1.add(new Person(777,"Pandey"));
		System.out.println(t1);

	}

}
class Person implements Comparable{
	int phone;
	String name;
	Person(int phone,String name){
		this.phone=phone;
		this.name=name;
	}
	public String toString(){
		return phone+" "+name;
	}

	@Override
	public int compareTo(Object o) {
		Person p1=(Person)o;
		return -(this.phone-p1.phone);
		
	}
}