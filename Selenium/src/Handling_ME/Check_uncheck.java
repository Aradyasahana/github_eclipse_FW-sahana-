package Handling_ME;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_uncheck {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/X-path.html");
		 List<WebElement> chbox = driver.findElements(By.xpath("//input"));
		int count = chbox.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			WebElement WE = chbox.get(i);
			WE.click();	
		}
		for(int i=count-1; i>=0; i-- )
		{
			WebElement WE1 = chbox.get(i);
			WE1.click();
		}
	}

}
