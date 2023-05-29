package Selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_byusing_tagname
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Clickaction.html");
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("a1")).sendKeys("sahana");

	}

}
