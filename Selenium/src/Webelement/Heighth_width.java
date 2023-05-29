package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heighth_width
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.id("pass"));
		int fs = ele.getSize().getHeight();
		System.out.println(fs);
		int fd = ele.getSize().getWidth();
		System.out.println(fd);
	}
}
