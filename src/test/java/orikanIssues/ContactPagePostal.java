package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import components.BaseTest;

public class ContactPagePostal  {
	WebDriver driver;
@Test
	public void ContactPagepost()  {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("Dinesh", "kumar", "119", "sadsff123", "Hyderabad", "Queensland");
		
		SoftAssert sa = new SoftAssert();
		
		boolean postcodeInvalid=driver.findElement(By.xpath("//*[text()='Invalid Postal Code']")).isDisplayed();
		sa.assertTrue(postcodeInvalid);
		sa.assertAll();
		
	}
}

