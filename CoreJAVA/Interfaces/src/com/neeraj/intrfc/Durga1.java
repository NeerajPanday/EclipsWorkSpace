package com.neeraj.intrfc;

public interface Durga1 
{
void m1();
void m2();
}
abstract class ServicesProvider1 implements Durga1
{
	public void m1()
	{
		System.out.println("ths is valid interface");
	}
}
abstract class ServicesProvider2 implements Durga1
{
	public void m2()
	{
		System.out.println("ths is valid interface");
	}
}
class Hello
{
	public static void main(String...as)
	{
		System.out.println("Hey");
		
	}
}
