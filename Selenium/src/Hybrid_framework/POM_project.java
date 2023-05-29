package Hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_project 
{
	//declaration
			@FindBy(xpath="//a[.='Log in']")
			private WebElement untbox;
			@FindBy(id="edit-name--2")
			private WebElement pwdtf;
			@FindBy(id="edit-pass--2")
			private WebElement loginbutton;
			@FindBy(id="edit-submit--18")
			private WebElement loginbutton2;
			
			//Initialization
			public POM_project(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Utilization
			public void loginData1()
			{
				loginbutton2.click();
			}
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
