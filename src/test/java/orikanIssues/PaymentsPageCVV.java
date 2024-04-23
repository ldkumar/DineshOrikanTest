package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import components.BaseTest;

public class PaymentsPageCVV {
	WebDriver driver;

	@Test
	public void paymentPageValidation() {
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("Dinesh", "kumar", "119", "sadsff123", "Hyderabad", "Queensland");
		
		bt.paymentPage("dineshKumar", "1111111111" , "12353563", "February", "2025");

	
        
        SoftAssert sa = new SoftAssert();
        
        boolean  cardCVVDigits=driver.findElement(By.xpath("//*[text()='Card CVV allows 3-4 digits']")).isDisplayed();
        sa.assertTrue(cardCVVDigits);
        sa.assertAll();    
        driver.quit();
        
        

        

	}
}

