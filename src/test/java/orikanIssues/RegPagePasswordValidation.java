package orikanIssues;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import components.BaseTest;

public class RegPagePasswordValidation {
	WebDriver driver;

	@Test
	public void passwordValidate() {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		bt.registration("dinesh@or", "", "");
		String passwordError= driver.findElement(By.xpath("//*[text()='Password is required.']")).getText();
			Assert.assertEquals("Password is required", passwordError);
			//Assert.assertFalse(true);
			driver.quit();

	}

}
