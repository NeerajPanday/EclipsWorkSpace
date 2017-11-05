package neeraj;
import java.util.*;
public class ReverseOfAlpaOrder {

	public static void main(String[] args) {
   TreeSet t=new TreeSet(new Employee1());
   t.add("Niraj");
   t.add("neeraj");
   t.add("name	");
   t.add("nitin");
   System.out.println(t);
	}

}
class Employee1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);	 
	}	
}