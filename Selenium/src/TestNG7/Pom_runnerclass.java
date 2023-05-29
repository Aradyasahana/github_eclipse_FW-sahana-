package TestNG7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pom_runnerclass 
{
	@Test
	public void validlogin()
	{
	    System.setProperty("webdriver.chrome.driver","./Software/chromedriver32.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Pom_ScriptGeneric p = new Pom_ScriptGeneric(driver);
	    p.UnData("aradyasahan@gmail.com");
	    p.pwdData("Aradya@98");
	    p.loginData();
	}

}
