package TestNG7;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript07 extends GenericScript
{
	@Test
      public void Login()
      {
    	  driver.findElement(By.xpath("//a[.='Log in']")).click();
    	  driver.findElement(By.id("edit-name--2")).sendKeys("sadmin");
    	  driver.findElement(By.id("edit-pass--2")).sendKeys("sadmin");
    	  driver.findElement(By.id("edit-submit--18")).click();
    	  System.out.println(driver.getTitle());
      }
}
