package Hybrid_framework;

import org.testng.annotations.Test;

public class Test_project_RC extends Generic_project
{
	@Test
	public void validLogin()
	{
	POM_project p=new POM_project(driver);
	p.loginData1();
	p.UnData("sdfvbn");
	p.pwdData("123456789");
	p.loginData();
	}

}
