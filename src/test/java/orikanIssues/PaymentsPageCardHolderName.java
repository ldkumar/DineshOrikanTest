package orikanIssues;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import components.BaseTest;

public class PaymentsPageCardHolderName {
	
	WebDriver driver;

	@Test
	public void paymentPageValidation() {
		
		driver=new ChromeDriver();
		BaseTest bt = new BaseTest(driver);
		bt.goTo();
		
		bt.registration("dinesh@orikan", "dinesh", "dinesh");
	
		bt.contactPage("Dinesh", "kumar", "119", "sadsff123", "Hyderabad", "Queensland");
		
		bt.paymentPage("1234dinesh1Kumar", "1111111111" , "123", "February", "2025");
        
        SoftAssert sa = new SoftAssert();
        boolean  invalidHolderName=driver.findElement(By.xpath("//*[text()='Invalid Card Holder Name']")).isDisplayed();
        sa.assertTrue(invalidHolderName);
        
        sa.assertAll();    
        driver.quit();
        
        

        

     
	}
}

