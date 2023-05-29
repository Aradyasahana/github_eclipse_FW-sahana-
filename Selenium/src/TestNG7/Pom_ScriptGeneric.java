package TestNG7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_ScriptGeneric 
{
	//declaration
	@FindBy(name="email")
	private WebElement untbox;
	@FindBy(name="pass")
	private WebElement pwdtf;
	@FindBy(name="login")
	private WebElement loginbutton;
	
	//Initialization
	public Pom_ScriptGeneric(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void UnData(String fN)
	{
		untbox.sendKeys(fN);
	}
	public void pwdData(String pwd)
	{
		pwdtf.sendKeys(pwd);
	}
	public void loginData()
	{
		loginbutton.click();
	}
	
}
