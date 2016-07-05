package com.neeraj;

import java.util.TreeSet;

public class Comprble {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new Employee11(101,"Neeraj", "Bangalore"));
		t.add(new Employee11(105,"Pankaj", "Chennai"));
		t.add(new Employee11(109,"Akash", "pune"));
		System.out.println(t);

	}

}
class Employee11 implements Comparable{
	int id;
	String name;
	String add;
	Employee11(int id,String name,String add){
		this.id=id;
		this.id=id;
	}
	public int compareTo(Object o){
		Employee s=(Employee)o;
		return this.name.compareTo(s.name);
	}
	public String toString(){
		return name+" "+id+" "+add;
	}
}