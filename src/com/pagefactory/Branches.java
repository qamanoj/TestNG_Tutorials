package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Branches 
{
	WebDriver driver;

	public Branches(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//By branches=By.xpath("//img[@src='images/Branches_but.jpg']");
	
	@FindBy(xpath="//img[@src='images/Branches_but.jpg']")
	WebElement branches;

	
	public WebElement BranchesButton()
	{
		//return driver.findElement(branches);
		return branches;
	}
}
