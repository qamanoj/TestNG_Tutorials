package com.testng.Assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert 
{
	@Test
	public void tc_1()
	{
		String actual= "asr";
		Reporter.log("step 1",true);
		Reporter.log("step 2",true);
		Reporter.log("step 3",true);
		//SoftAssert s=new SoftAssert();
		String expected="asr";
		Assert.assertEquals(actual, expected);
		Reporter.log("step 4",true);
				
	}
}
