package Selenium_script;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_open_close 
{

	public static void main(String[] args) throws InterruptedException
	{
		String key ="webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}

}
