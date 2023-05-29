package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Fileupload.html");
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\Admin\\Desktop\\SAHANA G CV.docx");

	}

}
