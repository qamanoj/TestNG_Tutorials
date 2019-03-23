package com.testng.groupexecution;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups={"smoketest"})
	public void tc_1()
	{
		System.out.println("first testcase");
	}
	@Test(groups={"regrationtest"})
	public void tc_2()
	{
		System.out.println("second testcase");
	}
	@Test(groups={"regrationtest"})
	public void tc_3()
	{
		System.out.println("third testcase");
	}
}
