package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//a[@title='Urdu']"));
		String text = ele.getText();
		System.out.println(text);
		Point locn = ele.getLocation();
		System.out.println(locn);
		int x = locn.getX();
		System.out.println(x);
		int y = locn.getY();
		System.out.println(y);
	}
}
