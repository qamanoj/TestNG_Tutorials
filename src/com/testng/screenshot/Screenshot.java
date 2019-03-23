package com.testng.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot 
{
	@Test
	public void tc_1() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		/*EventFiringWebDriver e=new EventFiringWebDriver(driver);
		
		File srcimage=e.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("D:\\Selenium\\ScreenShot\\ScreenShot.png");
		
		FileUtils.copyFile(srcimage, destFile);*/
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile, new File( "D:\\Selenium\\ScreenShot\\ScreenShot.png") );
	}
}
