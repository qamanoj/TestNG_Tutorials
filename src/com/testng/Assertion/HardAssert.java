package com.testng.Assertion;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
	public void tc_1()
	{
		System.out.println("step1");
		System.out.println("step2");
		assertEquals("A", "B");//or assertEquals("B","A")
		System.out.println("step3");
		Assert.assertEquals("X", "Y");
		System.out.println("step4");
	}
	@Test
	public void tc_2()
	{
		System.out.println("**********");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
	}
}
