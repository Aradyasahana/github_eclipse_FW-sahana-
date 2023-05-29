package TestNG7;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Qcom_runnerclass extends Qcom_project
{
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.id("edit-name--2")).sendKeys("sadmin");
		driver.findElement(By.id("edit-pass--2")).sendKeys("sadmin");
		driver.findElement(By.id("edit-submit--18")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void failed()
	{
		Assert.fail();
	}
}
