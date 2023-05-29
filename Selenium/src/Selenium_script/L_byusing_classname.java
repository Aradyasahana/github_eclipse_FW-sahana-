package Selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_byusing_classname
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Passdata.html");
		driver.findElement(By.id("a1")).click();
		driver.findElement(By.className("c1")).sendKeys("sahana");
		//driver.findElement(By.className("c1")).sendKeys("sahana");
		//driver.findElement(By.className("c1")).sendKeys("sahana");

	}

}
