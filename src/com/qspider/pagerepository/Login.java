package com.qspider.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	@FindBy(id="txtuId")
	WebElement username;

	@FindBy(id="txtPword")
	WebElement password;

	@FindBy(id="login")
	WebElement login;
	
	public void login(String usernm,String psw)
	{
		username.sendKeys(usernm);
		password.sendKeys(psw);
		login.click();
	}
}
