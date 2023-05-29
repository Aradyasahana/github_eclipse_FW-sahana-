package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_only_PB {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		String Parent = driver.getWindowHandle();
		Set<String> allWH = driver.getWindowHandles();
		for(String WH:allWH)
		{
			driver.switchTo().window(WH);
			String title = driver.getTitle();
			System.out.println(title);
			if(WH.equals(Parent))
			{
				driver.close();
			}
		}

	}

}
