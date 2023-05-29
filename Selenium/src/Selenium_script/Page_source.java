package Selenium_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_source
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Flipkart.com");
		Thread.sleep(2000);
		String tittle = driver.getTitle();
		System.out.println(tittle);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String souce = driver.getPageSource();
		System.out.println(souce);
		
	}

}
