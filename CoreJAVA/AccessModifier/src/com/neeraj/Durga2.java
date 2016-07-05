package com.neeraj;
class Child
{
	Child()
	{
		System.out.println(this.hashCode());
	}
}
class Parent extends Child
{
	Parent()
	{
		System.out.println(hashCode());
	}
}

public class Durga2 {

	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.hashCode());
	}

}
