package com.neeraj.string;

public class Neeraj {

	public static void main(String[] args) {
		Hello h=new Hello("mohan");
		System.out.println(h);
		Hello h1=h.modify("Heera");
		System.out.println(h==h1); 
		System.out.println(h1);
		int myLenght = "Hello world".length();
		System.out.println(myLenght);

	}

}
final class Hello
{
	private String s;
	Hello(String s)
	{
		this.s=s;
	}
	public  Hello modify(String s)
	{
		if(this.s==s)
		{
			return this;
		}else
			return (new Hello(s));
	}
}

