package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_all_browser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allWH = driver.getWindowHandles();
		int count = allWH.size();
		System.out.println(count);
		for(String WH:allWH)
		{
			System.out.println(WH);
		}
			

	}

}
