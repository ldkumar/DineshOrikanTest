package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import components.BaseTest;

public class ContactPageFirstName  {
	WebDriver driver;
@Test
	public void ContactPage()  {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("12dinesh", "kumar", "119", "sadsff123", "Hyderabad", "Queensland");
		
		SoftAssert sa = new SoftAssert();		
		boolean firstname =driver.findElement(By.xpath("//*[text()='Invalid First name']")).isDisplayed(); // Validate for Firstname textbox
		sa.assertTrue(firstname);
		sa.assertAll();
		
	}
}

