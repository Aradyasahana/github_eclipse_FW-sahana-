package Handling_disabled_element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_data {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<3; i++)
	    {
	    	js.executeScript("window.scrollBy(0,500)");
	    	Thread.sleep(2000);
	    }
	    for(int i=0; i<3; i++)
	    {
	    	js.executeScript("window.scrollBy(0,-500)");
	    	Thread.sleep(2000);
	    }

	}

}
