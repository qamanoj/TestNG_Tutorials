package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*By username=By.id("txtuId");
	By password=By.id("txtPword");
	By login=By.id("login");
	 */


	//another case by using pagefactory

	@FindBy(id="txtuId")
	WebElement username;

	@FindBy(id="txtPword")
	WebElement password;

	@FindBy(id="login")
	WebElement login;

	public WebElement UserName()
	{
		//return driver.findElement(username);
		return username;
	}

	public WebElement Password()
	{
		//return driver.findElement(password);
		return password;
	}

	public WebElement Login()
	{
		//return driver.findElement(login);
		return login;
	}
}
