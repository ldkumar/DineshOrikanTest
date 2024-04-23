package orikanIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import components.BaseTest;

public class PaymentsPageExpireYear {
	
	WebDriver driver;

	@Test
	public void paymentPageValidation() {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("Dinesh", "kumar", "119", "sadsff123", "Hyderabad", "Queensland");
		
		bt.paymentPage("dineshKumar", "11111111113562" , "123", "February", "1990");
        
        SoftAssert sa = new SoftAssert();
           
        boolean  expireYearValid=driver.findElement(By.xpath("//*[text()='Expire Year should not be less than current Year]")).isDisplayed();
        sa.assertTrue(expireYearValid);
        sa.assertAll();    
        driver.quit();
        
	}
}

        

        

