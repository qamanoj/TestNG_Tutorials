package com.testng.annotations;

import org.testng.annotations.Test;

public class TestngDemo 
{
	@Test(invocationCount=5)
	public void createcustomertest()
	{
		System.out.println("execute createcustomertest");
	}
	@Test(enabled=false)
	public void modifycustomertest()
	{
		System.out.println("execute modifycustomertest");
	}
	@Test(enabled=true)
	public void deletecustomertest()
	{
		System.out.println("execute deletecustomertest");
	}
}
