package Child_browser_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_assigment {

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allWH = driver.getWindowHandles();
		for(String WH:allWH)
		{
			driver.switchTo().window(WH);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}

}
