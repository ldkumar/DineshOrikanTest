package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import components.BaseTest;

public class PaymentsPageCardNumber {
	WebDriver driver;
	@Test
	public void paymentPageValidation() {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("Dinesh", "kumar", "119", "sadsff123", "Hyderabad", "Queensland");
		
		bt.paymentPage("dineshKumar", "111111111145657688q34532t" , "123", "February", "2025");
        
        SoftAssert sa = new SoftAssert();
          
        boolean  cardNumberdigits=driver.findElement(By.xpath("//*[text()='Card Number Not Allows more than 16 digits']")).isDisplayed();
        sa.assertTrue(cardNumberdigits);
        
        sa.assertAll();    
        driver.quit();
	}
}
        
        

 
