package com.qspider.pagerepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class custTest 
{
	@Test
	public void TestCase()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Login page=PageFactory.initElements(driver, Login.class);
		
		page.login("Admin","Admin");
	}

}
