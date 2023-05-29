package Selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ig
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("aradyasahana@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aradya@98");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
