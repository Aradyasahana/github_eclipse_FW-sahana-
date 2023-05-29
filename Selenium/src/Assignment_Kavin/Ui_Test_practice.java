package Assignment_Kavin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ui_Test_practice {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.xpath("//a[.='Form']")).click();
		driver.findElement(By.id("firstname")).sendKeys("sahana");
		driver.findElement(By.id("lastname")).sendKeys("G");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//option[.='India'1")).click();
		
		

	}

}
