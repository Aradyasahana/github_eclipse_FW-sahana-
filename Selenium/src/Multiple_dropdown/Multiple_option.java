package Multiple_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Multiple_option {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook/r.php");
		 WebElement chbox = driver.findElement(By.id("year"));
		Select s = new Select(chbox);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);

	}

}
