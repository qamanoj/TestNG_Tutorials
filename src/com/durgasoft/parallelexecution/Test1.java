package com.durgasoft.parallelexecution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1{
	Reporter reporter=new Reporter();
	@Test
	public void tc_1(){
		reporter.log("this testcase username is invalid");
		System.out.println("this is testcase 1");
		Assert.assertEquals("test", "test123");
	}
	@Test
	public void tc_2(){
		reporter.log("this testcase username is invalid");
		System.out.println("this is testcase 2");
	}
	@Test
	public void tc_3(){
		String username="selenium";
		reporter.log("this testcase username and password is invalid :::::"+username);
		System.out.println("this is testcase 3");
	}
}
