package pac3;

import org.testng.annotations.Test;

public class ModifyUser 
{
	@Test(groups={"smoketest"})
	public void modifycustomertest()
	{
		System.out.println("execute modifycustomertest");
	}
	@Test(groups={"regrationtest"})
	public void creatcustomertest()
	{
		System.out.println("execute createcustomertest");
	}
	@Test(groups={"regrationtest"})
	public void deletecustomertest()
	{
		System.out.println("execute deletecustomertest");
	}	
}
