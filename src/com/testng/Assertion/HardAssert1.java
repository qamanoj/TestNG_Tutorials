package com.testng.Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert1 
{
	@Test
	public void tc_1()
	{
		Reporter.log("step 1",true);
		Reporter.log("step 2",true);
		Reporter.log("step 3",true);
		Assert.assertEquals("hdfc","acd");
		Reporter.log("step 4",true);
	}
	@Test
	public void tc_2()
	{
		Reporter.log("---------",true);
		Reporter.log("step 1",true);
		Reporter.log("step 2",true);
		Reporter.log("step 3",true);
		Assert.assertEquals("hdfc1","hdfc1");
		Reporter.log("step 4",true);	
		
	}
}
