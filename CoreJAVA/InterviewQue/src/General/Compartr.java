package General;

import java.util.Comparator;
import java.util.TreeSet;

public class Compartr {

	public static void main(String[] args) {
    TreeSet t=new TreeSet(new SortById());
    t.add(new Hellon(101,"Neeraj"));
    t.add(new Hellon(100,"Pandey"));
    t.add(new Hellon(99,"Kumar"));
    System.out.println(t);
    	
    

	}

}
class Hellon{
	int sid;
	String name;
	Hellon(int sid, String name){
		this.sid=sid;
		this.name=name;
	}
	public String toString(){
		return sid+" "+name;
	}
}
class SortByName implements Comparator{
 public int compare(Object o1,Object o2){
	 Hellon h1=(Hellon)o1;
	 Hellon h2=(Hellon)o2;
	 return -(h1.name.compareTo(h2.name));
 }
}