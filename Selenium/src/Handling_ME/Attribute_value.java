package Handling_ME;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_value
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> chbox = driver.findElements(By.xpath("//a"));
		int count = chbox.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement AL = chbox.get(i);
			String AV = AL.getAttribute("href");
			System.out.println(AV);
		}

	}
}
