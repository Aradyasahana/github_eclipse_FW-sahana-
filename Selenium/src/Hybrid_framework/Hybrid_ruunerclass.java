package Hybrid_framework;

import org.testng.annotations.Test;

public class Hybrid_ruunerclass extends Generic_HFW
{
	@Test
	public void validLogin()
	{
	POM_hfw_FB p = new POM_hfw_FB(driver);
    p.UnData("aradyasahan@gmail.com");
    p.pwdData("Aradya@98");
    p.loginData();
	}

}
