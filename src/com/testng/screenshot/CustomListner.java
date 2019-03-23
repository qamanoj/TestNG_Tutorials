package com.testng.screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListner extends TestListenerAdapter
{
	public void onTestFailure(ITestResult tr)
	{
		File scrFile = ((TakesScreenshot)ScreenShot1.driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(scrFile, new File("./ScreenShot"+tr.getName()+".png"));
		}
		catch (IOException e) 
		{				
			e.printStackTrace();
		}
	}
}
