package neeraj;
import java.util.*;
public class Neeraj1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet (new MyComparable1());
		t.add(12);
		t.add(10);
		t.add(15);
		System.out.println(t);
	}

}
class MyComparable1 implements Comparator{

	public int compare(Object arg1,Object arg2) {
		Integer i1=(Integer)arg1;
		Integer i2=(Integer)arg2;
		return i1.compareTo(i2);
		
		
		
		
	}	
}