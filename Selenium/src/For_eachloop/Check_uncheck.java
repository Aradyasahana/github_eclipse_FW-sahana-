package For_eachloop;

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
		driver.get("https://www.flipkart.com");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count = link.size();
		System.out.println(count);
		for(WebElement ln:link)
		{
			String h = ln.getAttribute("href");
			System.out.println(h);
		}

	}

}
