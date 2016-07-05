package com.neeraj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class Arithmetic1Test {
// operation of Before
	@After
	public  void np(){
	System.out.println("After test case");
	}
	@Before
	public void np1(){
		System.out.println("Before test case");
	}
	@BeforeClass
	public static void  np2(){
		System.out.println("Before class case");
	}
	@AfterClass
	public static void np3(){
		System.out.println("After class");
	}
	
	@Test
	public void test() {
		Arithmetic1 a=new Arithmetic1();
		int m=a.sum(10, 20);
		int m1=a.sum(23, 23);
		int m2=a.sub(10,20);
		Assert.assertEquals(m, 30);
		Assert.
		Assert.assertEquals(m1, 46);
		Assert.assertEquals(m2, -10);
		System.out.println("test case");
	}

}
