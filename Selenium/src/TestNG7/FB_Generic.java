package TestNG7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FB_Generic 
{

	public WebDriver driver;
	@BeforeMethod
	public void openAppl()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver32.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void closeAppl()
	{
		driver.close();
	}
}
