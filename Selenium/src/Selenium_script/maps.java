package Selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class maps 
	{

		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/maps/@12.9794048,77.5913472,12z");
			 WebElement ele = driver.findElement(By.xpath("//input[@class='hArJGc']"));
              ele.click();
		  WebElement ele1 = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		   ele1.sendKeys("banglore");
		   WebElement ele2 = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		   ele2.sendKeys("mysore");
		  		}

	}



