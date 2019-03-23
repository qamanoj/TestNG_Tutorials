package com.testng.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 
{
	WebDriver driver;
	@BeforeClass
	public void lunch()
	{
		System.out.println("lunch browser");
		driver =new FirefoxDriver();
		driver.get("http://www.google");
	}
	@AfterClass
	public void close()
	{
		System.out.println("close");
		driver.quit();
	}
	@Test
	public void tc_1()
	{
		System.out.println("first testcase");
		driver.findElement(By.name("q")).sendKeys("selenium");
	}
	@Test
	public void tc_2()
	{
		System.out.println("second testcase");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Test
	public void tc_3()
	{
		System.out.println("third testcase");
		driver.findElement(By.linkText("Downloads - Selenium")).click();
	}
	@BeforeMethod
	public void start()
	{
		System.out.println("login");
	}
	@AfterMethod
	public void end()
	{
		System.out.println("logout");

	}

}
