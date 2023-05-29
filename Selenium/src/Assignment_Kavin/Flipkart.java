package Assignment_Kavin;

import java.awt.AWTException;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver32.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement elem = driver.findElement(By.xpath("//input[@class='_3704LK']"));	
        elem.sendKeys("iphone13");
        elem.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Midnight, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
        Thread.sleep(2000);
        String cost = ele.getText();
        String fincost = cost.replaceAll("₹", "");
        String finso = fincost.replaceAll(",", "");
        System.out.println(finso);
	}
}
