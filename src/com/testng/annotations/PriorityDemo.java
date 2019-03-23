package com.testng.annotations;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority=2)
	public void tc_1()
	{
		System.out.println("this is first testcase");
	}
	@Test(priority=3)
	public void tc_2()
	{
		System.out.println("this is second testcase");
	}
	@Test(priority=1)
	public void tc_3()
	{
		System.out.println("this is third testcase");
	}
	@Test(enabled=false)
	public void tc_4()
	{
		System.out.println("this is forth testcase");
	}
	@Test(enabled=true,priority=1)
	public void tc_5()
	{
		System.out.println("this is fifth testcase");
	}
}
