package com.testng.screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ScreenShot1 
{
	Reporter reporter=new Reporter();
	public static WebDriver driver;
	@Test(priority=1)
	public void tc_1() throws InterruptedException, IOException
	{
		String data="problem by developer";
		reporter.log("this testcase username is invalid====="+data);
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=h3aMWtalIoawX_3cncAC");
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("D:\\Selenium\\seleniumScreenshot\\screenshot.png"));*/
		Assert.assertEquals("test", "test1");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void tc_2() throws InterruptedException
	{
		String data="problem by developer";
		reporter.log("this testcase password is invalid======="+data);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Assert.assertEquals("test", "test1");
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void tc_3() throws InterruptedException 
	{
		String data="problem by developer";
		reporter.log("this testcase username and password is invalid====="+data);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertEquals("test", "test1");
		Thread.sleep(3000);
	}
}
