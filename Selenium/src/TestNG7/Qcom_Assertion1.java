package TestNG7;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Qcom_Assertion1 extends Qcom_project
{
	@Test
	public void login1()
	{
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("edit-name--2")).sendKeys("sadmin");
		driver.findElement(By.id("edit-pass--2")).sendKeys("sadmin");
		driver.findElement(By.id("edit-submit--18")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "QCommerce | We Provide Good products");
		System.out.println("1");
	}

}
