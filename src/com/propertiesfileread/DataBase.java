package com.propertiesfileread;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DataBase
{
	public WebDriver driver;
	@Test
	public void Login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fil=new FileInputStream("D:\\Manoj WorkSpace\\TestNGTutorials\\src\\com\\propertiesfileread\\datadriven.properties");
		prop.load(fil);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("URL"));
		String data=prop.getProperty("browser");
		System.out.println(data);
		System.out.println("testdata login");
		if(prop.getProperty("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			if(prop.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else
			{
				if(prop.getProperty("browser").equals("ie"))
				{
					System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}
			}
		}
		driver.get(prop.getProperty("URL"));
	}
	@Test
	public void Browser()
	{
		System.out.println("testdata Browser");
	}
	@Test
	public void Logout()
	{
		System.out.println("testdata logout");
	}
}
