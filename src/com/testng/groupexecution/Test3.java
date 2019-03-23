package com.testng.groupexecution;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups={"smoketest"})
	public void tc_7()
	{
		System.out.println("seven testcase");
	}
	@Test(groups={"regrationtest"})
	public void tc_8()
	{
		System.out.println("eight testcase");
	}
	@Test(groups={"regrationtest"})
	public void tc_9()
	{
		System.out.println("nine testcase");
	}
}
