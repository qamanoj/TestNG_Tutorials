package com.testng.annotations;

import org.testng.annotations.Test;

public class Example 
{
	@Test
	public void tc_1()
	{
		System.out.println("first testcase"); 
	}
	@Test(dependsOnMethods="tc_3")
	public void tc_2()
	{
		System.out.println("second testcase"); 
	}

	@Test
	public void tc_3()
	{
		System.out.println("third testcase"); 
	}

}
