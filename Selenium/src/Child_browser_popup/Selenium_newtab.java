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

public class Selenium_newtab {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		WebElement dl = driver.findElement(By.xpath("//span[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(dl).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		WebElement dl1 = driver.findElement(By.xpath("//span[.='Documentation']"));
		Actions act1 = new Actions(driver);
		act.contextClick(dl1).perform();
		Robot r1 = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		WebElement dl11 = driver.findElement(By.xpath("//span[.='Projects']"));
		Actions act11 = new Actions(driver);
		act.contextClick(dl11).perform();
		Robot r11 = new Robot();
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
