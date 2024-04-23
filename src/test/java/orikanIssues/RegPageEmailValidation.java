package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import components.BaseTest;

public class RegPageEmailValidation {
	WebDriver driver;
	@Test
	
	public void emailValidate() {
//		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		bt.registration("dinesh@or", "dinesh", "dinesh");
		boolean Emailvalidate=driver.findElement(By.xpath("//*[text()='Invalid email address.']")).isDisplayed();
		Assert.assertTrue(Emailvalidate);

	}

}
