package Selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_maps
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.https://www.google.com/maps/@21.125498,81.914063,5z?authuser=0.com");
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("rajajinagar");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("mantri square");
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
	}

}
