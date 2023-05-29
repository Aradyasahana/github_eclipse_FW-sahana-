package generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom_script.POM_Script;

public class Test_script_class extends POM_Script
{
	@Test
	public void validLogin()
	{
	POM_Script p = new POM_Script(driver);
	p.loginData1();
	p.UnData("sadmin");
	p.pwdData("sadmin");
	p.submitdata();
	}

}
