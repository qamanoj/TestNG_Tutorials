package com.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 
{
	@Parameters({"URL","http"})
	@Test
	public void tc_1(String website,String data)
	{
		System.out.println("first testcase");
		System.out.println(website);
		System.out.println(data);
	}
	@Test(dataProvider="getdata")
	public void tc_2(String username,String password)
	{
		System.out.println("second testcase");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="getfirstusername";
		data[0][1]="firstpassword";
		data[1][0]="getsecondusername";
		data[1][1]="secondpassword";
		data[2][0]="getthirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
