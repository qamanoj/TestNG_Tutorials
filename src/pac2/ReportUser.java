package pac2;

import org.testng.annotations.Test;

public class ReportUser 
{
	@Test(groups={"smoketest"})
	public void modifycustomertest1()
	{
		System.out.println("execute modifycustomertest");
	}
	@Test(groups={"regrationttest"})
	public void creatcustomertest1()
	{
		System.out.println("execute createcustomertest");
	}
	@Test(groups={"regrationttest"})
	public void deletecustomertest1()
	{
		System.out.println("execute deletecustomertest");
	}
}
