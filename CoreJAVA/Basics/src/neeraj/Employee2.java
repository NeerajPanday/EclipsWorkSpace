package neeraj;
import java.util.*;
public class Employee2 {

	public static void main(String[] args) {
		Hello h1 =new Hello("neeraj", 1);
		Hello h2= new Hello("pawan", 2);
		TreeSet t=new TreeSet();
		t.add(h1);
		t.add(h2);
		System.out.println(t);
	

	}

}
class Hello implements Comparable{
	String name;
	int eid;
	Hello(String name, int eid){
		this.name=name;
		this.eid=eid;
		}
	public String toString(){
		return name+" "+ eid;
	}
	public int compareTo(Object obj){
		int eid1=this.eid;
		Hello h=(Hello)obj;
		int eid2=h.eid;
		if(eid1>eid2){
			return -1;
			
		}else if(eid2>eid1){
			return +1;
		}else{
			return 0;
		}			
	}
}