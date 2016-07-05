package com.neeraj.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.neeraj.Arithmetic;

public class ArithmeticTest {

	@Test
	public void test() {
		
		Assert.assertEquals(Arithmetic.sum(10, 20), 34);
		
	}

}
