package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_child_browser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		String Parent = driver.getWindowHandle();
		Set<String> allWH = driver.getWindowHandles();
		int count = allWH.size();
		System.out.println(count);
		allWH.remove(Parent);
		int count1 = allWH.size();
		System.out.println(count1);
		for(String WH:allWH)
		{
			driver.switchTo().window(WH);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}

	}

}
