package com.testng.parrallelexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 
{
	public WebDriver driver;
	@Parameters("mybrowser")
	@BeforeClass
	public void lunchbrowser(String mybrowser)
	{
		if(mybrowser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();	
		}
		else
		{
			if(mybrowser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else
			{
				if(mybrowser.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}		
			}
		}
	}
	@Test
	public void tc_1()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
	}
}
