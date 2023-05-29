package Selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_yahoo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.mail.yahoo.com/d/folders/1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aradyasahanag@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//body[@class='bucket']")).sendKeys("Aradya@98");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//a[text()='compose']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("aradyasahana@gmail.com");
	    driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("hello automation");
	    driver.findElement(By.xpath("//span[text()='send']")).click();
	}

}
