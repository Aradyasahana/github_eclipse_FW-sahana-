package Hybrid_framework;

import org.testng.annotations.Test;

public class Test_Endtoend extends Generic_endtoend
{
	@Test
	public void validLogin()
	{
	POM_endtoend p = new POM_endtoend(driver);
	p.loginData1();
	p.UnData("sadmin");
	p.pwdData("sadmin");
	p.submitdata();
	}

}
