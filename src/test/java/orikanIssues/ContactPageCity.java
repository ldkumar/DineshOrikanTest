package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import components.BaseTest;

public class ContactPageCity  {
	WebDriver driver;
@Test
	public void ContactPage()  {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
		bt.contactPage("dinesh", "kumar", "119", "sadsff123", "121qer33", "Queensland");
		SoftAssert sa = new SoftAssert();
		boolean city =driver.findElement(By.xpath("//*[text()='City don't allowed numeric']")).isDisplayed();// Validate for City textbox
		sa.assertTrue(city);
		sa.assertAll();
		
	}
}

