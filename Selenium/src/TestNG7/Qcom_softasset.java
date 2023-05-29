package TestNG7;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Qcom_softasset  extends Qcom_project
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
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(title, "QCommerce | We Provide Good products");
		System.out.println("1");
		sa.assertAll();

    }
}
