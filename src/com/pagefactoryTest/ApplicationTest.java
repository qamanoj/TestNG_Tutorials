package com.pagefactoryTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.pagefactory.Branches;
import com.pagefactory.LoginPage;

public class ApplicationTest 
{
	@Test
	public void TestCase()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		LoginPage li=new LoginPage(driver);
		li.UserName().sendKeys("Admin");
		li.Password().sendKeys("Admin");
		li.Login().click();

		Branches b=new Branches(driver);
		b.BranchesButton().click();
	}

}
