package neeraj;

import java.lang.reflect.*;
class Test
{
	public static void main(String...as)
	
	{
		Student s=new Student();
		Class c=s.getClass();
		System.out.println(c.getName());
		Method[] m=c.getDeclaredMethods();
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
			Field[] f=c.getDeclaredFields();
			for(int i1=0;i1<f.length;i1++)
			{
				System.out.println(f[i1]);
			}
		}
	}
}

