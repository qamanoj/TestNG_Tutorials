package com.testng.groupexecution;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups={"smoketest"})
	public void tc_4()
	{
		System.out.println("forth testcase");
	}
	@Test(groups={"regrationtest"})
	public void tc_5()
	{
		System.out.println("fifth testcase");
	}
	@Test(groups={"regrstiontest"})
	public void tc_6()
	{
		System.out.println("sixth testcase");
	}
}
