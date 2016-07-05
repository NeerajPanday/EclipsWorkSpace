package com.neeraj.string;

public class ImmutableCreationClass {

	public static void main(String[] args) {
		CreateImmutableClass cc=new CreateImmutableClass(10);
		CreateImmutableClass cs=cc.modify(100);
		CreateImmutableClass ca=cc.modify(10);
		System.out.println(cc==cs);
		System.out.println(cc==ca);
		System.out.println(cs==ca);

	}

}
final class CreateImmutableClass
{
	private int x;
	CreateImmutableClass(int x)
	{
		this.x=x;
	}
	public CreateImmutableClass modify(int x)
	{
		if (this.x==x)
			return this;
		else
			return (new CreateImmutableClass(x));
	}
}