package Drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Mainpage.html");
		driver.findElement(By.id("A1")).sendKeys("dhanveer");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		 WebElement ele = driver.findElement(By.id("f1"));
		driver.switchTo().frame(ele);
		driver.findElement(By.id("B1")).sendKeys("gowda");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("A1")).sendKeys("dhanveer");
	}

}
