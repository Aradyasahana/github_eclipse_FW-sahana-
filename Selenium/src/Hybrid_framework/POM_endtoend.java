package Hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_endtoend 
{
	@FindBy(xpath="//a[.='Log in']")
	private WebElement loginbtn;
	@FindBy(id="edit-name--2")
	private WebElement unbtn;
	@FindBy(id="edit-pass--2")
	private WebElement pwdbtn;
	@FindBy(id="edit-submit--18")
	private WebElement submitbtm;
	
	@FindBy(className="default_t_color")
	private WebElement myac;
	@FindBy(xpath="//a[.='Checkout']")
	private WebElement checkot;
	
	
	public POM_endtoend(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void loginData1()
	{
		loginbtn.click();
	}
	public void UnData(String fN)
	{
		unbtn.sendKeys(fN);
	}
	public void pwdData(String pwd)
	{
		pwdbtn.sendKeys(pwd);
	}
	public void submitdata()
	{
		submitbtm.click();
	}
	
	public void myacc()
	{
		myac.click();
	}
	public void chot()
	{
		checkot.click();
	}
	
}
