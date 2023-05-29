package TestNG7;

import org.testng.annotations.Test;

public class Groups 
{
	@Test(groups = {"panda"})
	public void data2()
	{
		System.out.println("hello");
	}
	@Test(groups = {"dogyyy"})
	public void data3()
	{
		System.out.println("pandaaaa");
	}
	
	@Test(groups = {"panda","dogyyy"})
	public void data4()
	{
		System.out.println("tobyyyyyyy");
	}
	

}
