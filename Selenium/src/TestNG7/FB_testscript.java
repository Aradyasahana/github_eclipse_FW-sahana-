package TestNG7;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FB_testscript extends FB_Generic
{
	@Test
	public void login2()
	{
		driver.findElement(By.id("email")).sendKeys("aradyasahana@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aradya@98");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "QCommerce | We Provide Good products");
		System.out.println("1");
	}
}
