package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_confirmation_popup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		//a.accept();
		a.dismiss();


	}

}
